package com.yin.bigdata.api.domain.entities;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by aakhmerov on 16/08/14.
 */
@Entity
@XmlRootElement
@Table (name = "real_estates")
public class RealEstates extends AbstractPersistable<Long> {
    private String GKZ;
    private Long OBID;
    private String SCOUTID;
    private Long SOID;
    private Long OQID;
    private Long OK1ID;
    private Long OK2ID;
    private String VTCODE;
    private String STCODE_STANDORT;
    private String STCODE_IS;
    private String NTCODE;
    private String SPCODE;
    private String WACODE;
    private String ZICODE;
    private Long ABGELEITET_VON;
    private String ANBIETEROBJEKTKATEGORIE;
    private String ADRESSEZEIGEN;
    private String QUELLEREFNUM;
    private String ANBIETERREFNUM;
    private Long GEOX;
    private Long GEOY;
    private Long KOID;
    private Long LAID;
    private Long BLID;
    private Long SKID;
    private Long BGID;
    private String STRASSE;
    private String HAUSNR;
    private String PLZ;
    private String ORT;
    private Long WOHNFLAECHE;
    private Long ZIMMERANZAHL;
    private Long BAUJAHR;
    private String COURTAGE;
    private Long MIETEKALT;
    private Long MIETEWARM;
    private String MIETEKAUTION;
    private Long KAUFPREIS;
    private String KAUFVERMIETET;
    private Long NEBENKOSTEN;
    private String ZUSATZKOSTEN;
    private String FREIAB;
    private Long VERKEHRSWERT;
    private Date VERSTEIGERUNGSTERMIN;
    private String UEBERSCHRIFT;
    private String URL;
    private String ENUTZER;
    private Date EDATUM;
    private String GNUTZER;
    private Date GDATUM;
    private Long ODS_SEQ_DTUE;
    private Long ODS_LOGID;
    private Date ODS_TS;
    private Long ODS_G_SEQ_DTUE;
    private Long ODS_G_LOGID;
    private String ODS_STCODE;
    private Date ODS_G_ODS_TS;
    private String TEMP;
    private Long MIETEPROQM;
    private Long BOBID;
    private Long NUTZFLAECHE;
    private Long HAUPTFLAECHE;
    private Long NEBENFLAECHE;
    private Long PARKFLAECHENZAHL;
    private Long PARKFLAECHENPREIS;
    private Long FUSSWEG_OEPNV;
    private Long FAHRZEIT_HBHF;
    private Long FAHRZEIT_BAB;
    private Long FAHRZEIT_AIRPORT;
    private String ETAGE;
    private Long OZID;
    private Long ITTYP;
    private Long ANREFNUM_IS;
    private Long MIETEINNAHMENPROMONAT;
    private Date DEAKTIVIERUNGSDATUM;
    private Date AENDERUNGSDATUM;
    private Long ANID;
    private Long HAUSNRVON;
    private Long HAUSNRBIS;
    private Long HEIZKOSTEN;
    private String HP_AKTIV;
    private String HEIZKOSTEN_IN_WM_ENTHALTEN;
    private Long GRUPPENSTATUS;
    private String API_SUCHFELD1;
    private String API_SUCHFELD2;
    private String API_SUCHFELD3;
    private Long GQID;
    private Long APWID;
    private Date ERSTE_AKTIVIERUNG;
    private Long LETZTE_MODERNISIERUNG;
    private Long HAID;
    private Long AQID;
    private Long EATID;
    private Long BPAID;
    private Long WGID;
    private Long EV_KENNWERT;
    private String EV_WWENTHALTEN;
    private String GEM_GESCHAEFT_MOEGLICH;
    private String PROVISION_ANZEIGEN;
    private String KELLER;
    private String BARRIEREFREI;
    private String DENKMALOBJEKT;
    private Long QUARTID;
    private Date ARCHIVIERUNGSDATUM;
    private Long GRUNDFLAECHE;
    private Long ADID_KONTAKT;
    private Long MIETEPROQM_BERECHNET;
    private Long MIETEKALT_BERECHNET;
    private Long IMMOBILIENPROJEKT_ID;
    private Long DUBLETTE_VON_OBID;
    private Long VERSION;
    private Long SYSTEM_ID;
    private Long KONTAKTFORMULAR_KONFIG_ID;
    private Long WT_ENERGIE_EFFIZENZ_KLASSE_ID;
    private String EV_ERSTELLUNGS_TYP;
    private Long EV_STROMVERBRAUCHSKENNWERT;
    private Long EV_HEIZENERGIEVERBRAUCHSKENNW;
    private Long EV_ENDENERGIEVERBRAUCH_STROM;
    private Long EV_ENDENERGIEVERBRAUCH_WAERME;
    private Long EV_ENDENERGIEBEDARF_STROM;
    private Long EV_ENDENERGIEBEDARF_WAERME;
    private Long EV_ENDENERGIEVERERBRAUCH;
    private String EV_BAUJAHR_NICHT_BEKANNT;
    private String EV_LAYER_VERBERGEN;
    private Long EV_ENERGIEAUSWEIS;
    private String ADRESSE_MEHRDEUTIG;


    public String getGKZ() {
        return GKZ;
    }

    public void setGKZ(String GKZ) {
        this.GKZ = GKZ;
    }

    public Long getOBID() {
        return OBID;
    }

    public void setOBID(Long OBID) {
        this.OBID = OBID;
    }

    public String getSCOUTID() {
        return SCOUTID;
    }

    public void setSCOUTID(String SCOUTID) {
        this.SCOUTID = SCOUTID;
    }

    public Long getSOID() {
        return SOID;
    }

    public void setSOID(Long SOID) {
        this.SOID = SOID;
    }

    public Long getOQID() {
        return OQID;
    }

    public void setOQID(Long OQID) {
        this.OQID = OQID;
    }

    public Long getOK1ID() {
        return OK1ID;
    }

    public void setOK1ID(Long OK1ID) {
        this.OK1ID = OK1ID;
    }

    public Long getOK2ID() {
        return OK2ID;
    }

    public void setOK2ID(Long OK2ID) {
        this.OK2ID = OK2ID;
    }

    public String getVTCODE() {
        return VTCODE;
    }

    public void setVTCODE(String VTCODE) {
        this.VTCODE = VTCODE;
    }

    public String getSTCODE_STANDORT() {
        return STCODE_STANDORT;
    }

    public void setSTCODE_STANDORT(String STCODE_STANDORT) {
        this.STCODE_STANDORT = STCODE_STANDORT;
    }

    public String getSTCODE_IS() {
        return STCODE_IS;
    }

    public void setSTCODE_IS(String STCODE_IS) {
        this.STCODE_IS = STCODE_IS;
    }

    public String getNTCODE() {
        return NTCODE;
    }

    public void setNTCODE(String NTCODE) {
        this.NTCODE = NTCODE;
    }

    public String getSPCODE() {
        return SPCODE;
    }

    public void setSPCODE(String SPCODE) {
        this.SPCODE = SPCODE;
    }

    public String getWACODE() {
        return WACODE;
    }

    public void setWACODE(String WACODE) {
        this.WACODE = WACODE;
    }

    public String getZICODE() {
        return ZICODE;
    }

    public void setZICODE(String ZICODE) {
        this.ZICODE = ZICODE;
    }

    public Long getABGELEITET_VON() {
        return ABGELEITET_VON;
    }

    public void setABGELEITET_VON(Long ABGELEITET_VON) {
        this.ABGELEITET_VON = ABGELEITET_VON;
    }

    public String getANBIETEROBJEKTKATEGORIE() {
        return ANBIETEROBJEKTKATEGORIE;
    }

    public void setANBIETEROBJEKTKATEGORIE(String ANBIETEROBJEKTKATEGORIE) {
        this.ANBIETEROBJEKTKATEGORIE = ANBIETEROBJEKTKATEGORIE;
    }

    public String getADRESSEZEIGEN() {
        return ADRESSEZEIGEN;
    }

    public void setADRESSEZEIGEN(String ADRESSEZEIGEN) {
        this.ADRESSEZEIGEN = ADRESSEZEIGEN;
    }

    public String getQUELLEREFNUM() {
        return QUELLEREFNUM;
    }

    public void setQUELLEREFNUM(String QUELLEREFNUM) {
        this.QUELLEREFNUM = QUELLEREFNUM;
    }

    public String getANBIETERREFNUM() {
        return ANBIETERREFNUM;
    }

    public void setANBIETERREFNUM(String ANBIETERREFNUM) {
        this.ANBIETERREFNUM = ANBIETERREFNUM;
    }

    public Long getGEOX() {
        return GEOX;
    }

    public void setGEOX(Long GEOX) {
        this.GEOX = GEOX;
    }

    public Long getGEOY() {
        return GEOY;
    }

    public void setGEOY(Long GEOY) {
        this.GEOY = GEOY;
    }

    public Long getKOID() {
        return KOID;
    }

    public void setKOID(Long KOID) {
        this.KOID = KOID;
    }

    public Long getLAID() {
        return LAID;
    }

    public void setLAID(Long LAID) {
        this.LAID = LAID;
    }

    public Long getBLID() {
        return BLID;
    }

    public void setBLID(Long BLID) {
        this.BLID = BLID;
    }

    public Long getSKID() {
        return SKID;
    }

    public void setSKID(Long SKID) {
        this.SKID = SKID;
    }

    public Long getBGID() {
        return BGID;
    }

    public void setBGID(Long BGID) {
        this.BGID = BGID;
    }

    public String getSTRASSE() {
        return STRASSE;
    }

    public void setSTRASSE(String STRASSE) {
        this.STRASSE = STRASSE;
    }

    public String getHAUSNR() {
        return HAUSNR;
    }

    public void setHAUSNR(String HAUSNR) {
        this.HAUSNR = HAUSNR;
    }

    public String getPLZ() {
        return PLZ;
    }

    public void setPLZ(String PLZ) {
        this.PLZ = PLZ;
    }

    public String getORT() {
        return ORT;
    }

    public void setORT(String ORT) {
        this.ORT = ORT;
    }

    public Long getWOHNFLAECHE() {
        return WOHNFLAECHE;
    }

    public void setWOHNFLAECHE(Long WOHNFLAECHE) {
        this.WOHNFLAECHE = WOHNFLAECHE;
    }

    public Long getZIMMERANZAHL() {
        return ZIMMERANZAHL;
    }

    public void setZIMMERANZAHL(Long ZIMMERANZAHL) {
        this.ZIMMERANZAHL = ZIMMERANZAHL;
    }

    public Long getBAUJAHR() {
        return BAUJAHR;
    }

    public void setBAUJAHR(Long BAUJAHR) {
        this.BAUJAHR = BAUJAHR;
    }

    public String getCOURTAGE() {
        return COURTAGE;
    }

    public void setCOURTAGE(String COURTAGE) {
        this.COURTAGE = COURTAGE;
    }

    public Long getMIETEKALT() {
        return MIETEKALT;
    }

    public void setMIETEKALT(Long MIETEKALT) {
        this.MIETEKALT = MIETEKALT;
    }

    public Long getMIETEWARM() {
        return MIETEWARM;
    }

    public void setMIETEWARM(Long MIETEWARM) {
        this.MIETEWARM = MIETEWARM;
    }

    public String getMIETEKAUTION() {
        return MIETEKAUTION;
    }

    public void setMIETEKAUTION(String MIETEKAUTION) {
        this.MIETEKAUTION = MIETEKAUTION;
    }

    public Long getKAUFPREIS() {
        return KAUFPREIS;
    }

    public void setKAUFPREIS(Long KAUFPREIS) {
        this.KAUFPREIS = KAUFPREIS;
    }

    public String getKAUFVERMIETET() {
        return KAUFVERMIETET;
    }

    public void setKAUFVERMIETET(String KAUFVERMIETET) {
        this.KAUFVERMIETET = KAUFVERMIETET;
    }

    public Long getNEBENKOSTEN() {
        return NEBENKOSTEN;
    }

    public void setNEBENKOSTEN(Long NEBENKOSTEN) {
        this.NEBENKOSTEN = NEBENKOSTEN;
    }

    public String getZUSATZKOSTEN() {
        return ZUSATZKOSTEN;
    }

    public void setZUSATZKOSTEN(String ZUSATZKOSTEN) {
        this.ZUSATZKOSTEN = ZUSATZKOSTEN;
    }

    public String getFREIAB() {
        return FREIAB;
    }

    public void setFREIAB(String FREIAB) {
        this.FREIAB = FREIAB;
    }

    public Long getVERKEHRSWERT() {
        return VERKEHRSWERT;
    }

    public void setVERKEHRSWERT(Long VERKEHRSWERT) {
        this.VERKEHRSWERT = VERKEHRSWERT;
    }

    public Date getVERSTEIGERUNGSTERMIN() {
        return VERSTEIGERUNGSTERMIN;
    }

    public void setVERSTEIGERUNGSTERMIN(Date VERSTEIGERUNGSTERMIN) {
        this.VERSTEIGERUNGSTERMIN = VERSTEIGERUNGSTERMIN;
    }

    public String getUEBERSCHRIFT() {
        return UEBERSCHRIFT;
    }

    public void setUEBERSCHRIFT(String UEBERSCHRIFT) {
        this.UEBERSCHRIFT = UEBERSCHRIFT;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getENUTZER() {
        return ENUTZER;
    }

    public void setENUTZER(String ENUTZER) {
        this.ENUTZER = ENUTZER;
    }

    public Date getEDATUM() {
        return EDATUM;
    }

    public void setEDATUM(Date EDATUM) {
        this.EDATUM = EDATUM;
    }

    public String getGNUTZER() {
        return GNUTZER;
    }

    public void setGNUTZER(String GNUTZER) {
        this.GNUTZER = GNUTZER;
    }

    public Date getGDATUM() {
        return GDATUM;
    }

    public void setGDATUM(Date GDATUM) {
        this.GDATUM = GDATUM;
    }

    public Long getODS_SEQ_DTUE() {
        return ODS_SEQ_DTUE;
    }

    public void setODS_SEQ_DTUE(Long ODS_SEQ_DTUE) {
        this.ODS_SEQ_DTUE = ODS_SEQ_DTUE;
    }

    public Long getODS_LOGID() {
        return ODS_LOGID;
    }

    public void setODS_LOGID(Long ODS_LOGID) {
        this.ODS_LOGID = ODS_LOGID;
    }

    public Date getODS_TS() {
        return ODS_TS;
    }

    public void setODS_TS(Date ODS_TS) {
        this.ODS_TS = ODS_TS;
    }

    public Long getODS_G_SEQ_DTUE() {
        return ODS_G_SEQ_DTUE;
    }

    public void setODS_G_SEQ_DTUE(Long ODS_G_SEQ_DTUE) {
        this.ODS_G_SEQ_DTUE = ODS_G_SEQ_DTUE;
    }

    public Long getODS_G_LOGID() {
        return ODS_G_LOGID;
    }

    public void setODS_G_LOGID(Long ODS_G_LOGID) {
        this.ODS_G_LOGID = ODS_G_LOGID;
    }

    public String getODS_STCODE() {
        return ODS_STCODE;
    }

    public void setODS_STCODE(String ODS_STCODE) {
        this.ODS_STCODE = ODS_STCODE;
    }

    public Date getODS_G_ODS_TS() {
        return ODS_G_ODS_TS;
    }

    public void setODS_G_ODS_TS(Date ODS_G_ODS_TS) {
        this.ODS_G_ODS_TS = ODS_G_ODS_TS;
    }

    public String getTEMP() {
        return TEMP;
    }

    public void setTEMP(String TEMP) {
        this.TEMP = TEMP;
    }

    public Long getMIETEPROQM() {
        return MIETEPROQM;
    }

    public void setMIETEPROQM(Long MIETEPROQM) {
        this.MIETEPROQM = MIETEPROQM;
    }

    public Long getBOBID() {
        return BOBID;
    }

    public void setBOBID(Long BOBID) {
        this.BOBID = BOBID;
    }

    public Long getNUTZFLAECHE() {
        return NUTZFLAECHE;
    }

    public void setNUTZFLAECHE(Long NUTZFLAECHE) {
        this.NUTZFLAECHE = NUTZFLAECHE;
    }

    public Long getHAUPTFLAECHE() {
        return HAUPTFLAECHE;
    }

    public void setHAUPTFLAECHE(Long HAUPTFLAECHE) {
        this.HAUPTFLAECHE = HAUPTFLAECHE;
    }

    public Long getNEBENFLAECHE() {
        return NEBENFLAECHE;
    }

    public void setNEBENFLAECHE(Long NEBENFLAECHE) {
        this.NEBENFLAECHE = NEBENFLAECHE;
    }

    public Long getPARKFLAECHENZAHL() {
        return PARKFLAECHENZAHL;
    }

    public void setPARKFLAECHENZAHL(Long PARKFLAECHENZAHL) {
        this.PARKFLAECHENZAHL = PARKFLAECHENZAHL;
    }

    public Long getPARKFLAECHENPREIS() {
        return PARKFLAECHENPREIS;
    }

    public void setPARKFLAECHENPREIS(Long PARKFLAECHENPREIS) {
        this.PARKFLAECHENPREIS = PARKFLAECHENPREIS;
    }

    public Long getFUSSWEG_OEPNV() {
        return FUSSWEG_OEPNV;
    }

    public void setFUSSWEG_OEPNV(Long FUSSWEG_OEPNV) {
        this.FUSSWEG_OEPNV = FUSSWEG_OEPNV;
    }

    public Long getFAHRZEIT_HBHF() {
        return FAHRZEIT_HBHF;
    }

    public void setFAHRZEIT_HBHF(Long FAHRZEIT_HBHF) {
        this.FAHRZEIT_HBHF = FAHRZEIT_HBHF;
    }

    public Long getFAHRZEIT_BAB() {
        return FAHRZEIT_BAB;
    }

    public void setFAHRZEIT_BAB(Long FAHRZEIT_BAB) {
        this.FAHRZEIT_BAB = FAHRZEIT_BAB;
    }

    public Long getFAHRZEIT_AIRPORT() {
        return FAHRZEIT_AIRPORT;
    }

    public void setFAHRZEIT_AIRPORT(Long FAHRZEIT_AIRPORT) {
        this.FAHRZEIT_AIRPORT = FAHRZEIT_AIRPORT;
    }

    public String getETAGE() {
        return ETAGE;
    }

    public void setETAGE(String ETAGE) {
        this.ETAGE = ETAGE;
    }

    public Long getOZID() {
        return OZID;
    }

    public void setOZID(Long OZID) {
        this.OZID = OZID;
    }

    public Long getITTYP() {
        return ITTYP;
    }

    public void setITTYP(Long ITTYP) {
        this.ITTYP = ITTYP;
    }

    public Long getANREFNUM_IS() {
        return ANREFNUM_IS;
    }

    public void setANREFNUM_IS(Long ANREFNUM_IS) {
        this.ANREFNUM_IS = ANREFNUM_IS;
    }

    public Long getMIETEINNAHMENPROMONAT() {
        return MIETEINNAHMENPROMONAT;
    }

    public void setMIETEINNAHMENPROMONAT(Long MIETEINNAHMENPROMONAT) {
        this.MIETEINNAHMENPROMONAT = MIETEINNAHMENPROMONAT;
    }

    public Date getDEAKTIVIERUNGSDATUM() {
        return DEAKTIVIERUNGSDATUM;
    }

    public void setDEAKTIVIERUNGSDATUM(Date DEAKTIVIERUNGSDATUM) {
        this.DEAKTIVIERUNGSDATUM = DEAKTIVIERUNGSDATUM;
    }

    public Date getAENDERUNGSDATUM() {
        return AENDERUNGSDATUM;
    }

    public void setAENDERUNGSDATUM(Date AENDERUNGSDATUM) {
        this.AENDERUNGSDATUM = AENDERUNGSDATUM;
    }

    public Long getANID() {
        return ANID;
    }

    public void setANID(Long ANID) {
        this.ANID = ANID;
    }

    public Long getHAUSNRVON() {
        return HAUSNRVON;
    }

    public void setHAUSNRVON(Long HAUSNRVON) {
        this.HAUSNRVON = HAUSNRVON;
    }

    public Long getHAUSNRBIS() {
        return HAUSNRBIS;
    }

    public void setHAUSNRBIS(Long HAUSNRBIS) {
        this.HAUSNRBIS = HAUSNRBIS;
    }

    public Long getHEIZKOSTEN() {
        return HEIZKOSTEN;
    }

    public void setHEIZKOSTEN(Long HEIZKOSTEN) {
        this.HEIZKOSTEN = HEIZKOSTEN;
    }

    public String getHP_AKTIV() {
        return HP_AKTIV;
    }

    public void setHP_AKTIV(String HP_AKTIV) {
        this.HP_AKTIV = HP_AKTIV;
    }

    public String getHEIZKOSTEN_IN_WM_ENTHALTEN() {
        return HEIZKOSTEN_IN_WM_ENTHALTEN;
    }

    public void setHEIZKOSTEN_IN_WM_ENTHALTEN(String HEIZKOSTEN_IN_WM_ENTHALTEN) {
        this.HEIZKOSTEN_IN_WM_ENTHALTEN = HEIZKOSTEN_IN_WM_ENTHALTEN;
    }

    public Long getGRUPPENSTATUS() {
        return GRUPPENSTATUS;
    }

    public void setGRUPPENSTATUS(Long GRUPPENSTATUS) {
        this.GRUPPENSTATUS = GRUPPENSTATUS;
    }

    public String getAPI_SUCHFELD1() {
        return API_SUCHFELD1;
    }

    public void setAPI_SUCHFELD1(String API_SUCHFELD1) {
        this.API_SUCHFELD1 = API_SUCHFELD1;
    }

    public String getAPI_SUCHFELD2() {
        return API_SUCHFELD2;
    }

    public void setAPI_SUCHFELD2(String API_SUCHFELD2) {
        this.API_SUCHFELD2 = API_SUCHFELD2;
    }

    public String getAPI_SUCHFELD3() {
        return API_SUCHFELD3;
    }

    public void setAPI_SUCHFELD3(String API_SUCHFELD3) {
        this.API_SUCHFELD3 = API_SUCHFELD3;
    }

    public Long getGQID() {
        return GQID;
    }

    public void setGQID(Long GQID) {
        this.GQID = GQID;
    }

    public Long getAPWID() {
        return APWID;
    }

    public void setAPWID(Long APWID) {
        this.APWID = APWID;
    }

    public Date getERSTE_AKTIVIERUNG() {
        return ERSTE_AKTIVIERUNG;
    }

    public void setERSTE_AKTIVIERUNG(Date ERSTE_AKTIVIERUNG) {
        this.ERSTE_AKTIVIERUNG = ERSTE_AKTIVIERUNG;
    }

    public Long getLETZTE_MODERNISIERUNG() {
        return LETZTE_MODERNISIERUNG;
    }

    public void setLETZTE_MODERNISIERUNG(Long LETZTE_MODERNISIERUNG) {
        this.LETZTE_MODERNISIERUNG = LETZTE_MODERNISIERUNG;
    }

    public Long getHAID() {
        return HAID;
    }

    public void setHAID(Long HAID) {
        this.HAID = HAID;
    }

    public Long getAQID() {
        return AQID;
    }

    public void setAQID(Long AQID) {
        this.AQID = AQID;
    }

    public Long getEATID() {
        return EATID;
    }

    public void setEATID(Long EATID) {
        this.EATID = EATID;
    }

    public Long getBPAID() {
        return BPAID;
    }

    public void setBPAID(Long BPAID) {
        this.BPAID = BPAID;
    }

    public Long getWGID() {
        return WGID;
    }

    public void setWGID(Long WGID) {
        this.WGID = WGID;
    }

    public Long getEV_KENNWERT() {
        return EV_KENNWERT;
    }

    public void setEV_KENNWERT(Long EV_KENNWERT) {
        this.EV_KENNWERT = EV_KENNWERT;
    }

    public String getEV_WWENTHALTEN() {
        return EV_WWENTHALTEN;
    }

    public void setEV_WWENTHALTEN(String EV_WWENTHALTEN) {
        this.EV_WWENTHALTEN = EV_WWENTHALTEN;
    }

    public String getGEM_GESCHAEFT_MOEGLICH() {
        return GEM_GESCHAEFT_MOEGLICH;
    }

    public void setGEM_GESCHAEFT_MOEGLICH(String GEM_GESCHAEFT_MOEGLICH) {
        this.GEM_GESCHAEFT_MOEGLICH = GEM_GESCHAEFT_MOEGLICH;
    }

    public String getPROVISION_ANZEIGEN() {
        return PROVISION_ANZEIGEN;
    }

    public void setPROVISION_ANZEIGEN(String PROVISION_ANZEIGEN) {
        this.PROVISION_ANZEIGEN = PROVISION_ANZEIGEN;
    }

    public String getKELLER() {
        return KELLER;
    }

    public void setKELLER(String KELLER) {
        this.KELLER = KELLER;
    }

    public String getBARRIEREFREI() {
        return BARRIEREFREI;
    }

    public void setBARRIEREFREI(String BARRIEREFREI) {
        this.BARRIEREFREI = BARRIEREFREI;
    }

    public String getDENKMALOBJEKT() {
        return DENKMALOBJEKT;
    }

    public void setDENKMALOBJEKT(String DENKMALOBJEKT) {
        this.DENKMALOBJEKT = DENKMALOBJEKT;
    }

    public Long getQUARTID() {
        return QUARTID;
    }

    public void setQUARTID(Long QUARTID) {
        this.QUARTID = QUARTID;
    }

    public Date getARCHIVIERUNGSDATUM() {
        return ARCHIVIERUNGSDATUM;
    }

    public void setARCHIVIERUNGSDATUM(Date ARCHIVIERUNGSDATUM) {
        this.ARCHIVIERUNGSDATUM = ARCHIVIERUNGSDATUM;
    }

    public Long getGRUNDFLAECHE() {
        return GRUNDFLAECHE;
    }

    public void setGRUNDFLAECHE(Long GRUNDFLAECHE) {
        this.GRUNDFLAECHE = GRUNDFLAECHE;
    }

    public Long getADID_KONTAKT() {
        return ADID_KONTAKT;
    }

    public void setADID_KONTAKT(Long ADID_KONTAKT) {
        this.ADID_KONTAKT = ADID_KONTAKT;
    }

    public Long getMIETEPROQM_BERECHNET() {
        return MIETEPROQM_BERECHNET;
    }

    public void setMIETEPROQM_BERECHNET(Long MIETEPROQM_BERECHNET) {
        this.MIETEPROQM_BERECHNET = MIETEPROQM_BERECHNET;
    }

    public Long getMIETEKALT_BERECHNET() {
        return MIETEKALT_BERECHNET;
    }

    public void setMIETEKALT_BERECHNET(Long MIETEKALT_BERECHNET) {
        this.MIETEKALT_BERECHNET = MIETEKALT_BERECHNET;
    }

    public Long getIMMOBILIENPROJEKT_ID() {
        return IMMOBILIENPROJEKT_ID;
    }

    public void setIMMOBILIENPROJEKT_ID(Long IMMOBILIENPROJEKT_ID) {
        this.IMMOBILIENPROJEKT_ID = IMMOBILIENPROJEKT_ID;
    }

    public Long getDUBLETTE_VON_OBID() {
        return DUBLETTE_VON_OBID;
    }

    public void setDUBLETTE_VON_OBID(Long DUBLETTE_VON_OBID) {
        this.DUBLETTE_VON_OBID = DUBLETTE_VON_OBID;
    }

    public Long getVERSION() {
        return VERSION;
    }

    public void setVERSION(Long VERSION) {
        this.VERSION = VERSION;
    }

    public Long getSYSTEM_ID() {
        return SYSTEM_ID;
    }

    public void setSYSTEM_ID(Long SYSTEM_ID) {
        this.SYSTEM_ID = SYSTEM_ID;
    }

    public Long getKONTAKTFORMULAR_KONFIG_ID() {
        return KONTAKTFORMULAR_KONFIG_ID;
    }

    public void setKONTAKTFORMULAR_KONFIG_ID(Long KONTAKTFORMULAR_KONFIG_ID) {
        this.KONTAKTFORMULAR_KONFIG_ID = KONTAKTFORMULAR_KONFIG_ID;
    }

    public Long getWT_ENERGIE_EFFIZENZ_KLASSE_ID() {
        return WT_ENERGIE_EFFIZENZ_KLASSE_ID;
    }

    public void setWT_ENERGIE_EFFIZENZ_KLASSE_ID(Long WT_ENERGIE_EFFIZENZ_KLASSE_ID) {
        this.WT_ENERGIE_EFFIZENZ_KLASSE_ID = WT_ENERGIE_EFFIZENZ_KLASSE_ID;
    }

    public String getEV_ERSTELLUNGS_TYP() {
        return EV_ERSTELLUNGS_TYP;
    }

    public void setEV_ERSTELLUNGS_TYP(String EV_ERSTELLUNGS_TYP) {
        this.EV_ERSTELLUNGS_TYP = EV_ERSTELLUNGS_TYP;
    }

    public Long getEV_STROMVERBRAUCHSKENNWERT() {
        return EV_STROMVERBRAUCHSKENNWERT;
    }

    public void setEV_STROMVERBRAUCHSKENNWERT(Long EV_STROMVERBRAUCHSKENNWERT) {
        this.EV_STROMVERBRAUCHSKENNWERT = EV_STROMVERBRAUCHSKENNWERT;
    }

    public Long getEV_HEIZENERGIEVERBRAUCHSKENNW() {
        return EV_HEIZENERGIEVERBRAUCHSKENNW;
    }

    public void setEV_HEIZENERGIEVERBRAUCHSKENNW(Long EV_HEIZENERGIEVERBRAUCHSKENNW) {
        this.EV_HEIZENERGIEVERBRAUCHSKENNW = EV_HEIZENERGIEVERBRAUCHSKENNW;
    }

    public Long getEV_ENDENERGIEVERBRAUCH_STROM() {
        return EV_ENDENERGIEVERBRAUCH_STROM;
    }

    public void setEV_ENDENERGIEVERBRAUCH_STROM(Long EV_ENDENERGIEVERBRAUCH_STROM) {
        this.EV_ENDENERGIEVERBRAUCH_STROM = EV_ENDENERGIEVERBRAUCH_STROM;
    }

    public Long getEV_ENDENERGIEVERBRAUCH_WAERME() {
        return EV_ENDENERGIEVERBRAUCH_WAERME;
    }

    public void setEV_ENDENERGIEVERBRAUCH_WAERME(Long EV_ENDENERGIEVERBRAUCH_WAERME) {
        this.EV_ENDENERGIEVERBRAUCH_WAERME = EV_ENDENERGIEVERBRAUCH_WAERME;
    }

    public Long getEV_ENDENERGIEBEDARF_STROM() {
        return EV_ENDENERGIEBEDARF_STROM;
    }

    public void setEV_ENDENERGIEBEDARF_STROM(Long EV_ENDENERGIEBEDARF_STROM) {
        this.EV_ENDENERGIEBEDARF_STROM = EV_ENDENERGIEBEDARF_STROM;
    }

    public Long getEV_ENDENERGIEBEDARF_WAERME() {
        return EV_ENDENERGIEBEDARF_WAERME;
    }

    public void setEV_ENDENERGIEBEDARF_WAERME(Long EV_ENDENERGIEBEDARF_WAERME) {
        this.EV_ENDENERGIEBEDARF_WAERME = EV_ENDENERGIEBEDARF_WAERME;
    }

    public Long getEV_ENDENERGIEVERERBRAUCH() {
        return EV_ENDENERGIEVERERBRAUCH;
    }

    public void setEV_ENDENERGIEVERERBRAUCH(Long EV_ENDENERGIEVERERBRAUCH) {
        this.EV_ENDENERGIEVERERBRAUCH = EV_ENDENERGIEVERERBRAUCH;
    }

    public String getEV_BAUJAHR_NICHT_BEKANNT() {
        return EV_BAUJAHR_NICHT_BEKANNT;
    }

    public void setEV_BAUJAHR_NICHT_BEKANNT(String EV_BAUJAHR_NICHT_BEKANNT) {
        this.EV_BAUJAHR_NICHT_BEKANNT = EV_BAUJAHR_NICHT_BEKANNT;
    }

    public String getEV_LAYER_VERBERGEN() {
        return EV_LAYER_VERBERGEN;
    }

    public void setEV_LAYER_VERBERGEN(String EV_LAYER_VERBERGEN) {
        this.EV_LAYER_VERBERGEN = EV_LAYER_VERBERGEN;
    }

    public Long getEV_ENERGIEAUSWEIS() {
        return EV_ENERGIEAUSWEIS;
    }

    public void setEV_ENERGIEAUSWEIS(Long EV_ENERGIEAUSWEIS) {
        this.EV_ENERGIEAUSWEIS = EV_ENERGIEAUSWEIS;
    }

    public String getADRESSE_MEHRDEUTIG() {
        return ADRESSE_MEHRDEUTIG;
    }

    public void setADRESSE_MEHRDEUTIG(String ADRESSE_MEHRDEUTIG) {
        this.ADRESSE_MEHRDEUTIG = ADRESSE_MEHRDEUTIG;
    }
}
