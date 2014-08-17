-- DROP FUNCTION IF EXISTS yin_tools.calculate_objects_skyline();
CREATE OR REPLACE FUNCTION yin_tools.calculate_objects_skyline()
  RETURNS boolean AS
$BODY$
-- checks all the flats (imml_o24 objects) in the database, and detects which of them are in the skyline
/*
                                             Table "yin_data.t_objects"
        Column         |          Type          |                             Modifiers                             
-----------------------+------------------------+-------------------------------------------------------------------
 o_id                  | integer                | not null default nextval('yin_data.t_objects_o_id_seq'::regclass)
...
 geox                  | bigint                 | 
 geoy                  | bigint                 | 
... 
 wohnflaeche           | double precision       | 
 zimmeranzahl          | double precision       | 
 baujahr               | integer                | 
 courtage              | character varying(100) | 
 kaufpreis             | double precision       | 
 kaufvermietet         | boolean                | 
 nebenkosten           | double precision       | 
 zusatzkosten          | double precision       | 
 edatum                | date                   | not null
 parkflaechenzahl      | bigint                 | 
 parkflaechenpreis     | double precision       | 
 etage                 | character varying(50)  | 
 mieteinnahmenpromonat | double precision       | 
 heizkosten            | double precision       | 
 letzte_modernisierung | integer                | 
 keller                | boolean                | 
 barrierefrei          | boolean                | 
 denkmalobjekt         | boolean                | 
*/
DECLARE
    return_value boolean; 
    l_o1 record;
    l_o2 record;
    l_dominated_by bigint;
    l_is_skyline boolean;
    l_msg text;
BEGIN

    BEGIN
        return_value = FALSE;

	FOR l_o1 IN SELECT * FROM yin_data.t_objects --ORDER BY random() LIMIT 10
	  LOOP
--		RAISE INFO 'o_id: %', l_o1.o_id;
		l_is_skyline = TRUE;
		l_dominated_by = NULL;
		FOR l_o2 IN SELECT * FROM yin_data.t_objects 
	  	  LOOP
			--RAISE INFO '	Checking % against %', l_o1.o_id, l_o2.o_id;
			IF ( l_o2.wohnflaeche  > l_o1.wohnflaeche AND
			     l_o2.zimmeranzahl > l_o1.zimmeranzahl AND
			     l_o2.baujahr      > l_o1.baujahr AND
			     l_o2.kaufpreis    < l_o1.kaufpreis AND
			     l_o2.etage        > l_o1.etage
			    )
			THEN
				l_is_skyline = FALSE;
				l_dominated_by = l_o2.o_id;
			END IF;
		END LOOP;
/*
		IF l_is_skyline THEN
			RAISE INFO ' *** SKYLINE ***';
		ELSE
			RAISE INFO '   Dominated by o_id %', l_dominated_by;
		END IF;
*/

		UPDATE yin_data.t_objects SET o_is_skyline = l_is_skyline, o_dominated_by = l_dominated_by 
		WHERE o_id = l_o1.o_id;
    	END LOOP;
	return_value = TRUE;
        
    EXCEPTION WHEN OTHERS THEN
        RAISE INFO 'Exception in calculate_objects_skyline with SQL_ERRCODE % SQL_ERRM %', SQLSTATE, SQLERRM;
        return_value = FALSE;
    END;
    
    RETURN return_value;
END;

$BODY$
  LANGUAGE 'plpgsql' VOLATILE SECURITY DEFINER;
ALTER FUNCTION yin_tools.calculate_objects_skyline() OWNER TO yindb;
GRANT EXECUTE ON FUNCTION yin_tools.calculate_objects_skyline() TO public;

