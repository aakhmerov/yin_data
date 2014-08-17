DROP TABLE IF EXISTS yin_data.t_objects CASCADE;

CREATE TABLE yin_data.t_objects
(
  o_id serial,
  o_is_skyline boolean,
  o_dominated_by bigint,
  OBID bigint NOT NULL 
, OK2ID integer 
, GEOX bigint 
, GEOY bigint 
, BGID integer 
, STRASSE VARCHAR(100) 
, HAUSNR VARCHAR(30) 
, PLZ VARCHAR(20) 
, ORT VARCHAR(50) 
, WOHNFLAECHE double precision 
, ZIMMERANZAHL double precision 
, BAUJAHR integer 
, COURTAGE VARCHAR(100) 
, KAUFPREIS double precision 
, KAUFVERMIETET boolean
, NEBENKOSTEN double precision
, ZUSATZKOSTEN double precision
, UEBERSCHRIFT VARCHAR(100) 
, URL VARCHAR(300) 
, EDATUM DATE NOT NULL 
, PARKFLAECHENZAHL bigint
, PARKFLAECHENPREIS double precision
, ETAGE VARCHAR(50) 
, MIETEINNAHMENPROMONAT double precision
, HEIZKOSTEN double precision
, LETZTE_MODERNISIERUNG integer
, KELLER boolean
, BARRIEREFREI boolean
, DENKMALOBJEKT boolean
);
