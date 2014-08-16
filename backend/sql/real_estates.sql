drop table if exists real_estates;
create table real_estates (
GKZ VARCHAR(30),
OBID	NUMERIC(20,0),
SCOUTID	VARCHAR(15),
SOID	NUMERIC(10,0),
OQID	NUMERIC(10,0),
OK1ID	NUMERIC(2,0),
OK2ID	NUMERIC(5,0),
VTCODE	CHAR(1),
STCODE_STANDORT	CHAR(1),
STCODE_IS	CHAR(1),
NTCODE	CHAR(1),
SPCODE	CHAR(2),
WACODE	CHAR(3),
ZICODE	CHAR(1),
ABGELEITET_VON	NUMERIC(10,0),
ANBIETEROBJEKTKATEGORIE	VARCHAR(50),
ADRESSEZEIGEN	CHAR(1),
QUELLEREFNUM	VARCHAR(40),
ANBIETERREFNUM	VARCHAR(50),
GEOX	NUMERIC(10,0),
GEOY	NUMERIC(10,0),
KOID	NUMERIC(1,0),
LAID	NUMERIC(3,0),
BLID	NUMERIC(3,0),
SKID	NUMERIC(3,0),
BGID	NUMERIC(3,0),
STRASSE	VARCHAR(100),
HAUSNR	VARCHAR(30),
PLZ	VARCHAR(20),
ORT	VARCHAR(50),
WOHNFLAECHE	NUMERIC(10,2),
ZIMMERANZAHL	NUMERIC(6,2),
BAUJAHR	NUMERIC(4,0),
COURTAGE	VARCHAR(100),
MIETEKALT	NUMERIC(15,2),
MIETEWARM	NUMERIC(15,2),
MIETEKAUTION	VARCHAR(50),
KAUFPREIS	NUMERIC(15,2),
KAUFVERMIETET	CHAR(1),
NEBENKOSTEN	NUMERIC(15,2),
ZUSATZKOSTEN	VARCHAR(50),
FREIAB	VARCHAR(50),
VERKEHRSWERT	NUMERIC(15,2),
VERSTEIGERUNGSTERMIN	DATE,
UEBERSCHRIFT	VARCHAR(100),
URL	VARCHAR(300),
ENUTZER	VARCHAR(40),
EDATUM	DATE,
GNUTZER	VARCHAR(40),
GDATUM	DATE,
ODS_SEQ_DTUE	NUMERIC,
ODS_LOGID	NUMERIC,
ODS_TS	DATE,
ODS_G_SEQ_DTUE	NUMERIC,
ODS_G_LOGID	NUMERIC,
ODS_STCODE	CHAR(1),
ODS_G_ODS_TS	DATE,
TEMP	VARCHAR(50),
MIETEPROQM	NUMERIC(15,2),
BOBID	NUMERIC(5,0),
NUTZFLAECHE	NUMERIC(22,2),
HAUPTFLAECHE	NUMERIC(22,2),
NEBENFLAECHE	NUMERIC(10,2),
PARKFLAECHENZAHL	NUMERIC(5,0),
PARKFLAECHENPREIS	NUMERIC(15,2),
FUSSWEG_OEPNV	NUMERIC(2,0),
FAHRZEIT_HBHF	NUMERIC(2,0),
FAHRZEIT_BAB	NUMERIC(3,0),
FAHRZEIT_AIRPORT	NUMERIC(3,0),
ETAGE	VARCHAR(50),
OZID	NUMERIC(10,0),
ITTYP	NUMERIC(2,0),
ANREFNUM_IS	NUMERIC(20,0),
MIETEINNAHMENPROMONAT	NUMERIC(15,2),
DEAKTIVIERUNGSDATUM	DATE,
AENDERUNGSDATUM	DATE,
ANID	NUMERIC(20,0),
HAUSNRVON	NUMERIC(30,0),
HAUSNRBIS	NUMERIC(30,0),
HEIZKOSTEN	NUMERIC(15,2),
HP_AKTIV	CHAR(1),
HEIZKOSTEN_IN_WM_ENTHALTEN	CHAR(1),
GRUPPENSTATUS	NUMERIC(20,0),
API_SUCHFELD1	VARCHAR(16),
API_SUCHFELD2	VARCHAR(16),
API_SUCHFELD3	VARCHAR(16),
GQID	NUMERIC(6,0),
APWID	NUMERIC(3,0),
ERSTE_AKTIVIERUNG	DATE,
LETZTE_MODERNISIERUNG	NUMERIC(4,0),
HAID	NUMERIC(10,0),
AQID	NUMERIC,
EATID	NUMERIC,
BPAID	NUMERIC,
WGID	NUMERIC,
EV_KENNWERT	NUMERIC(6,2),
EV_WWENTHALTEN	CHAR(1),
GEM_GESCHAEFT_MOEGLICH	CHAR(1),
PROVISION_ANZEIGEN	CHAR(1),
KELLER	CHAR(1),
BARRIEREFREI	CHAR(1),
DENKMALOBJEKT	CHAR(1),
QUARTID	NUMERIC(14,0),
ARCHIVIERUNGSDATUM	DATE,
GRUNDFLAECHE	NUMERIC(10,2),
ADID_KONTAKT	NUMERIC(20,0),
MIETEPROQM_BERECHNET	NUMERIC(15,2),
MIETEKALT_BERECHNET	NUMERIC(15,2),
IMMOBILIENPROJEKT_ID	NUMERIC(20,0),
DUBLETTE_VON_OBID	NUMERIC(20,0),
VERSION	NUMERIC(10,0),
SYSTEM_ID	NUMERIC(20,0),
KONTAKTFORMULAR_KONFIG_ID	NUMERIC(20,0),
WT_ENERGIE_EFFIZENZ_KLASSE_ID	NUMERIC(20,0),
EV_ERSTELLUNGS_TYP	CHAR(1),
EV_STROMVERBRAUCHSKENNWERT	NUMERIC(6,2),
EV_HEIZENERGIEVERBRAUCHSKENNW	NUMERIC(6,2),
EV_ENDENERGIEVERBRAUCH_STROM	NUMERIC(6,2),
EV_ENDENERGIEVERBRAUCH_WAERME	NUMERIC(6,2),
EV_ENDENERGIEBEDARF_STROM	NUMERIC(6,2),
EV_ENDENERGIEBEDARF_WAERME	NUMERIC(6,2),
EV_ENDENERGIEVERERBRAUCH	NUMERIC(6,2),
EV_BAUJAHR_NICHT_BEKANNT	CHAR(1),
EV_LAYER_VERBERGEN	CHAR(1),
EV_ENERGIEAUSWEIS	NUMERIC(1,0),
ADRESSE_MEHRDEUTIG	CHAR(1)
)