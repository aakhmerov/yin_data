CREATE TABLE districts_data
(
    GKZ VARCHAR(30),
    OBID DECIMAL(20,0),
    SCOUTID VARCHAR(15),
    SOID DECIMAL(10,0),
    OQID DECIMAL(10,0),
    OK1ID DECIMAL(2,0),
    OK2ID DECIMAL(5,0),
    VTCODE CHAR(1),
    STCODE_STANDORT CHAR(1),
    STCODE_IS CHAR(1),
    NTCODE CHAR(1),
    SPCODE CHAR(2),
    WACODE CHAR(3),
    ZICODE CHAR(1),
    ABGELEITET_VON DECIMAL(10,0),
    ANBIETEROBJEKTKATEGORIE VARCHAR(50),
    ADRESSEZEIGEN CHAR(1),
    QUELLEREFNUM VARCHAR(40),
    ANBIETERREFNUM VARCHAR(50),
    GEOX DECIMAL(10,0),
    GEOY DECIMAL(10,0),
    KOID DECIMAL(1,0),
    LAID DECIMAL(3,0),
    BLID DECIMAL(3,0),
    SKID DECIMAL(3,0),
    BGID DECIMAL(3,0),
    STRASSE VARCHAR(100),
    HAUSNR VARCHAR(30),
    PLZ VARCHAR(20),
    ORT VARCHAR(50),
    WOHNFLAECHE DECIMAL(10,2),
    ZIMMERANZAHL DECIMAL(6,2),
    BAUJAHR DECIMAL(4,0),
    COURTAGE VARCHAR(100),
    MIETEKALT DECIMAL(15,2),
    MIETEWARM DECIMAL(15,2),
    MIETEKAUTION VARCHAR(50),
    KAUFPREIS DECIMAL(15,2),
    KAUFVERMIETET CHAR(1),
    NEBENKOSTEN DECIMAL(15,2),
    ZUSATZKOSTEN VARCHAR(50),
    FREIAB VARCHAR(50),
    VERKEHRSWERT DECIMAL(15,2),
    VERSTEIGERUNGSTERMIN DATE,
    UEBERSCHRIFT VARCHAR(100),
    URL VARCHAR(300),
    ENUTZER VARCHAR(40),
    EDATUM DATE,
    GNUTZER VARCHAR(40),
    GDATUM DATE,
    ODS_SEQ_DTUE DECIMAL(10,0),
    ODS_LOGID DECIMAL(10,0),
    ODS_TS DATE,
    ODS_G_SEQ_DTUE DECIMAL(10,0),
    ODS_G_LOGID DECIMAL(10,0),
    ODS_STCODE CHAR(1),
    ODS_G_ODS_TS DATE,
    TEMP VARCHAR(50),
    MIETEPROQM DECIMAL(15,2),
    BOBID DECIMAL(5,0),
    NUTZFLAECHE DECIMAL(22,2),
    HAUPTFLAECHE DECIMAL(22,2),
    NEBENFLAECHE DECIMAL(10,2),
    PARKFLAECHENZAHL DECIMAL(5,0),
    PARKFLAECHENPREIS DECIMAL(15,2),
    FUSSWEG_OEPNV DECIMAL(2,0),
    FAHRZEIT_HBHF DECIMAL(2,0),
    FAHRZEIT_BAB DECIMAL(3,0),
    FAHRZEIT_AIRPORT DECIMAL(3,0),
    ETAGE VARCHAR(50),
    OZID DECIMAL(10,0),
    ITTYP DECIMAL(2,0),
    ANREFNUM_IS DECIMAL(20,0),
    MIETEINNAHMENPROMONAT DECIMAL(15,2),
    DEAKTIVIERUNGSDATUM DATE,
    AENDERUNGSDATUM DATE,
    ANID DECIMAL(20,0),
    HAUSNRVON DECIMAL(30,0),
    HAUSNRBIS DECIMAL(30,0),
    HEIZKOSTEN DECIMAL(15,2),
    HP_AKTIV CHAR(1),
    HEIZKOSTEN_IN_WM_ENTHALTEN CHAR(1),
    GRUPPENSTATUS DECIMAL(20,0),
    API_SUCHFELD1 VARCHAR(16),
    API_SUCHFELD2 VARCHAR(16),
    API_SUCHFELD3 VARCHAR(16),
    GQID DECIMAL(6,0),
    APWID DECIMAL(3,0),
    ERSTE_AKTIVIERUNG DATE,
    LETZTE_MODERNISIERUNG DECIMAL(4,0),
    HAID DECIMAL(10,0),
    AQID DECIMAL(10,0),
    EATID DECIMAL(10,0),
    BPAID DECIMAL(10,0),
    WGID DECIMAL(10,0),
    EV_KENNWERT DECIMAL(6,2),
    EV_WWENTHALTEN CHAR(1),
    GEM_GESCHAEFT_MOEGLICH CHAR(1),
    PROVISION_ANZEIGEN CHAR(1),
    KELLER CHAR(1),
    BARRIEREFREI CHAR(1),
    DENKMALOBJEKT CHAR(1),
    QUARTID DECIMAL(14,0),
    ARCHIVIERUNGSDATUM DATE,
    GRUNDFLAECHE DECIMAL(10,2),
    ADID_KONTAKT DECIMAL(20,0),
    MIETEPROQM_BERECHNET DECIMAL(15,2),
    MIETEKALT_BERECHNET DECIMAL(15,2),
    IMMOBILIENPROJEKT_ID DECIMAL(20,0),
    DUBLETTE_VON_OBID DECIMAL(20,0),
    VERSION DECIMAL(10,0),
    SYSTEM_ID DECIMAL(20,0),
    KONTAKTFORMULAR_KONFIG_ID DECIMAL(20,0),
    WT_ENERGIE_EFFIZENZ_KLASSE_ID DECIMAL(20,0),
    EV_ERSTELLUNGS_TYP CHAR(1),
    EV_STROMVERBRAUCHSKENNWERT DECIMAL(6,2),
    EV_HEIZENERGIEVERBRAUCHSKENNW DECIMAL(6,2),
    EV_ENDENERGIEVERBRAUCH_STROM DECIMAL(6,2),
    EV_ENDENERGIEVERBRAUCH_WAERME DECIMAL(6,2),
    EV_ENDENERGIEBEDARF_STROM DECIMAL(6,2),
    EV_ENDENERGIEBEDARF_WAERME DECIMAL(6,2),
    EV_ENDENERGIEVERERBRAUCH DECIMAL(6,2),
    EV_BAUJAHR_NICHT_BEKANNT CHAR(1),
    EV_LAYER_VERBERGEN CHAR(1),
    EV_ENERGIEAUSWEIS DECIMAL(1,0),
    ADRESSE_MEHRDEUTIG CHAR(1)
);
CREATE TABLE real_estates
(
    GKZ VARCHAR(30),
    OBID DECIMAL(20,0),
    SCOUTID VARCHAR(15),
    SOID DECIMAL(10,0),
    OQID DECIMAL(10,0),
    OK1ID DECIMAL(2,0),
    OK2ID DECIMAL(5,0),
    VTCODE CHAR(1),
    STCODE_STANDORT CHAR(1),
    STCODE_IS CHAR(1),
    NTCODE CHAR(1),
    SPCODE CHAR(2),
    WACODE CHAR(3),
    ZICODE CHAR(1),
    ABGELEITET_VON DECIMAL(10,0),
    ANBIETEROBJEKTKATEGORIE VARCHAR(50),
    ADRESSEZEIGEN CHAR(1),
    QUELLEREFNUM VARCHAR(40),
    ANBIETERREFNUM VARCHAR(50),
    GEOX DECIMAL(10,0),
    GEOY DECIMAL(10,0),
    KOID DECIMAL(1,0),
    LAID DECIMAL(3,0),
    BLID DECIMAL(3,0),
    SKID DECIMAL(3,0),
    BGID DECIMAL(3,0),
    STRASSE VARCHAR(100),
    HAUSNR VARCHAR(30),
    PLZ VARCHAR(20),
    ORT VARCHAR(50),
    WOHNFLAECHE DECIMAL(10,2),
    ZIMMERANZAHL DECIMAL(6,2),
    BAUJAHR DECIMAL(4,0),
    COURTAGE VARCHAR(100),
    MIETEKALT DECIMAL(15,2),
    MIETEWARM DECIMAL(15,2),
    MIETEKAUTION VARCHAR(50),
    KAUFPREIS DECIMAL(15,2),
    KAUFVERMIETET CHAR(1),
    NEBENKOSTEN DECIMAL(15,2),
    ZUSATZKOSTEN VARCHAR(50),
    FREIAB VARCHAR(50),
    VERKEHRSWERT DECIMAL(15,2),
    VERSTEIGERUNGSTERMIN DATE,
    UEBERSCHRIFT VARCHAR(100),
    URL VARCHAR(300),
    ENUTZER VARCHAR(40),
    EDATUM DATE,
    GNUTZER VARCHAR(40),
    GDATUM DATE,
    ODS_SEQ_DTUE DECIMAL(10,0),
    ODS_LOGID DECIMAL(10,0),
    ODS_TS DATE,
    ODS_G_SEQ_DTUE DECIMAL(10,0),
    ODS_G_LOGID DECIMAL(10,0),
    ODS_STCODE CHAR(1),
    ODS_G_ODS_TS DATE,
    TEMP VARCHAR(50),
    MIETEPROQM DECIMAL(15,2),
    BOBID DECIMAL(5,0),
    NUTZFLAECHE DECIMAL(22,2),
    HAUPTFLAECHE DECIMAL(22,2),
    NEBENFLAECHE DECIMAL(10,2),
    PARKFLAECHENZAHL DECIMAL(5,0),
    PARKFLAECHENPREIS DECIMAL(15,2),
    FUSSWEG_OEPNV DECIMAL(2,0),
    FAHRZEIT_HBHF DECIMAL(2,0),
    FAHRZEIT_BAB DECIMAL(3,0),
    FAHRZEIT_AIRPORT DECIMAL(3,0),
    ETAGE VARCHAR(50),
    OZID DECIMAL(10,0),
    ITTYP DECIMAL(2,0),
    ANREFNUM_IS DECIMAL(20,0),
    MIETEINNAHMENPROMONAT DECIMAL(15,2),
    DEAKTIVIERUNGSDATUM DATE,
    AENDERUNGSDATUM DATE,
    ANID DECIMAL(20,0),
    HAUSNRVON DECIMAL(30,0),
    HAUSNRBIS DECIMAL(30,0),
    HEIZKOSTEN DECIMAL(15,2),
    HP_AKTIV CHAR(1),
    HEIZKOSTEN_IN_WM_ENTHALTEN CHAR(1),
    GRUPPENSTATUS DECIMAL(20,0),
    API_SUCHFELD1 VARCHAR(16),
    API_SUCHFELD2 VARCHAR(16),
    API_SUCHFELD3 VARCHAR(16),
    GQID DECIMAL(6,0),
    APWID DECIMAL(3,0),
    ERSTE_AKTIVIERUNG DATE,
    LETZTE_MODERNISIERUNG DECIMAL(4,0),
    HAID DECIMAL(10,0),
    AQID DECIMAL(10,0),
    EATID DECIMAL(10,0),
    BPAID DECIMAL(10,0),
    WGID DECIMAL(10,0),
    EV_KENNWERT DECIMAL(6,2),
    EV_WWENTHALTEN CHAR(1),
    GEM_GESCHAEFT_MOEGLICH CHAR(1),
    PROVISION_ANZEIGEN CHAR(1),
    KELLER CHAR(1),
    BARRIEREFREI CHAR(1),
    DENKMALOBJEKT CHAR(1),
    QUARTID DECIMAL(14,0),
    ARCHIVIERUNGSDATUM DATE,
    GRUNDFLAECHE DECIMAL(10,2),
    ADID_KONTAKT DECIMAL(20,0),
    MIETEPROQM_BERECHNET DECIMAL(15,2),
    MIETEKALT_BERECHNET DECIMAL(15,2),
    IMMOBILIENPROJEKT_ID DECIMAL(20,0),
    DUBLETTE_VON_OBID DECIMAL(20,0),
    VERSION DECIMAL(10,0),
    SYSTEM_ID DECIMAL(20,0),
    KONTAKTFORMULAR_KONFIG_ID DECIMAL(20,0),
    WT_ENERGIE_EFFIZENZ_KLASSE_ID DECIMAL(20,0),
    EV_ERSTELLUNGS_TYP CHAR(1),
    EV_STROMVERBRAUCHSKENNWERT DECIMAL(6,2),
    EV_HEIZENERGIEVERBRAUCHSKENNW DECIMAL(6,2),
    EV_ENDENERGIEVERBRAUCH_STROM DECIMAL(6,2),
    EV_ENDENERGIEVERBRAUCH_WAERME DECIMAL(6,2),
    EV_ENDENERGIEBEDARF_STROM DECIMAL(6,2),
    EV_ENDENERGIEBEDARF_WAERME DECIMAL(6,2),
    EV_ENDENERGIEVERERBRAUCH DECIMAL(6,2),
    EV_BAUJAHR_NICHT_BEKANNT CHAR(1),
    EV_LAYER_VERBERGEN CHAR(1),
    EV_ENERGIEAUSWEIS DECIMAL(1,0),
    ADRESSE_MEHRDEUTIG CHAR(1),
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT
);
CREATE TABLE real_estates_hist
(
    OBID DECIMAL(20,0),
    GUELTIG_VON DATE,
    GUELTIG_BIS DATE,
    ERSTE_AKTIVIERUNG DATE,
    LETZTE_AKTIVIERUNG DATE,
    POSTLEITZAHL VARCHAR(20),
    STRASSE VARCHAR(100),
    HAUSNRVON DECIMAL(30,0),
    HAUSNRBIS DECIMAL(30,0),
    HAUSNR_GERADEUNGERADE CHAR(1),
    GKZ VARCHAR(30),
    UEBERSCHRIFT VARCHAR(100),
    COURTAGE VARCHAR(100),
    KAUFPREIS DECIMAL(15,2),
    KAUFVERMIETET CHAR(1),
    MIETEINNAHMENPROMONAT DECIMAL(15,2),
    MIETEKALT DECIMAL(15,2),
    MIETEKAUTION VARCHAR(50),
    MIETEPROQM DECIMAL(15,2),
    MIETEWARM DECIMAL(15,2),
    NEBENKOSTEN DECIMAL(15,2),
    ZIMMERANZAHL DECIMAL(6,2),
    WOHNFLAECHE DECIMAL(10,2),
    NUTZFLAECHE DECIMAL(22,2),
    HAUPTFLAECHE DECIMAL(22,2),
    NEBENFLAECHE DECIMAL(10,2),
    GRUNDSTUECKSFLAECHE DECIMAL(10,2),
    BAUJAHR DECIMAL(4,0),
    ETAGE VARCHAR(50),
    ENERGIEAUSWEIS VARCHAR(50),
    LETZTE_DEAKTIVIERUNG DATE,
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT
);
