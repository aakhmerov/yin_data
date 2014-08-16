drop table if exists real_estates_hist;
create table real_estates_hist (
OBID	NUMERIC(20,0),
GUELTIG_VON	DATE,
GUELTIG_BIS	DATE,
ERSTE_AKTIVIERUNG	DATE,
LETZTE_AKTIVIERUNG	DATE,
POSTLEITZAHL	VARCHAR(20),
STRASSE	VARCHAR(100),
HAUSNRVON	NUMERIC(30,0),
HAUSNRBIS	NUMERIC(30,0),
HAUSNR_GERADEUNGERADE	CHAR(1),
GKZ	VARCHAR(30),
UEBERSCHRIFT	VARCHAR(100),
COURTAGE	VARCHAR(100),
KAUFPREIS	NUMERIC(15,2),
KAUFVERMIETET	CHAR(1),
MIETEINNAHMENPROMONAT	NUMERIC(15,2),
MIETEKALT	NUMERIC(15,2),
MIETEKAUTION	VARCHAR(50),
MIETEPROQM	NUMERIC(15,2),
MIETEWARM	NUMERIC(15,2),
NEBENKOSTEN	NUMERIC(15,2),
ZIMMERANZAHL	NUMERIC(6,2),
WOHNFLAECHE	NUMERIC(10,2),
NUTZFLAECHE	NUMERIC(22,2),
HAUPTFLAECHE	NUMERIC(22,2),
NEBENFLAECHE	NUMERIC(10,2),
GRUNDSTUECKSFLAECHE	NUMERIC(10,2),
BAUJAHR	NUMERIC(4,0),
ETAGE	VARCHAR(50),
ENERGIEAUSWEIS	VARCHAR(50),
LETZTE_DEAKTIVIERUNG	DATE
)