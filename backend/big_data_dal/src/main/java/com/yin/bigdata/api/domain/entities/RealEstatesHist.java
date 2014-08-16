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
@Table(name = "real_estates_hist")
public class RealEstatesHist extends AbstractPersistable<Long> {
    private Long OBID;
    private Date GUELTIG_VON;
    private Date GUELTIG_BIS;
    private Date ERSTE_AKTIVIERUNG;
    private Date LETZTE_AKTIVIERUNG;
    private String POSTLEITZAHL;
    private String STRASSE;
    private Long HAUSNRVON;
    private Long HAUSNRBIS;
    private String HAUSNR_GERADEUNGERADE;
    private String GKZ;
    private String UEBERSCHRIFT;
    private String COURTAGE;
    private Long KAUFPREIS;
    private String KAUFVERMIETET;
    private Long MIETEINNAHMENPROMONAT;

    private Long MIETEKALT;
    private String MIETEKAUTION;
    private Long MIETEPROQM;
    private Long MIETEWARM;
    private Long NEBENKOSTEN;
    private Long ZIMMERANZAHL;
    private Long WOHNFLAECHE;
    private Long NUTZFLAECHE;
    private Long HAUPTFLAECHE;
    private Long NEBENFLAECHE;
    private Long GRUNDSTUECKSFLAECHE;
    private Long BAUJAHR;
    private String ETAGE;
    private String ENERGIEAUSWEIS;
    private Date LETZTE_DEAKTIVIERUNG;


    public Long getOBID() {
        return OBID;
    }

    public void setOBID(Long OBID) {
        this.OBID = OBID;
    }

    public Date getGUELTIG_VON() {
        return GUELTIG_VON;
    }

    public void setGUELTIG_VON(Date GUELTIG_VON) {
        this.GUELTIG_VON = GUELTIG_VON;
    }

    public Date getGUELTIG_BIS() {
        return GUELTIG_BIS;
    }

    public void setGUELTIG_BIS(Date GUELTIG_BIS) {
        this.GUELTIG_BIS = GUELTIG_BIS;
    }

    public Date getERSTE_AKTIVIERUNG() {
        return ERSTE_AKTIVIERUNG;
    }

    public void setERSTE_AKTIVIERUNG(Date ERSTE_AKTIVIERUNG) {
        this.ERSTE_AKTIVIERUNG = ERSTE_AKTIVIERUNG;
    }

    public Date getLETZTE_AKTIVIERUNG() {
        return LETZTE_AKTIVIERUNG;
    }

    public void setLETZTE_AKTIVIERUNG(Date LETZTE_AKTIVIERUNG) {
        this.LETZTE_AKTIVIERUNG = LETZTE_AKTIVIERUNG;
    }

    public String getPOSTLEITZAHL() {
        return POSTLEITZAHL;
    }

    public void setPOSTLEITZAHL(String POSTLEITZAHL) {
        this.POSTLEITZAHL = POSTLEITZAHL;
    }

    public String getSTRASSE() {
        return STRASSE;
    }

    public void setSTRASSE(String STRASSE) {
        this.STRASSE = STRASSE;
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

    public String getHAUSNR_GERADEUNGERADE() {
        return HAUSNR_GERADEUNGERADE;
    }

    public void setHAUSNR_GERADEUNGERADE(String HAUSNR_GERADEUNGERADE) {
        this.HAUSNR_GERADEUNGERADE = HAUSNR_GERADEUNGERADE;
    }

    public String getGKZ() {
        return GKZ;
    }

    public void setGKZ(String GKZ) {
        this.GKZ = GKZ;
    }

    public String getUEBERSCHRIFT() {
        return UEBERSCHRIFT;
    }

    public void setUEBERSCHRIFT(String UEBERSCHRIFT) {
        this.UEBERSCHRIFT = UEBERSCHRIFT;
    }

    public String getCOURTAGE() {
        return COURTAGE;
    }

    public void setCOURTAGE(String COURTAGE) {
        this.COURTAGE = COURTAGE;
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

    public Long getMIETEINNAHMENPROMONAT() {
        return MIETEINNAHMENPROMONAT;
    }

    public void setMIETEINNAHMENPROMONAT(Long MIETEINNAHMENPROMONAT) {
        this.MIETEINNAHMENPROMONAT = MIETEINNAHMENPROMONAT;
    }

    public Long getMIETEKALT() {
        return MIETEKALT;
    }

    public void setMIETEKALT(Long MIETEKALT) {
        this.MIETEKALT = MIETEKALT;
    }

    public String getMIETEKAUTION() {
        return MIETEKAUTION;
    }

    public void setMIETEKAUTION(String MIETEKAUTION) {
        this.MIETEKAUTION = MIETEKAUTION;
    }

    public Long getMIETEPROQM() {
        return MIETEPROQM;
    }

    public void setMIETEPROQM(Long MIETEPROQM) {
        this.MIETEPROQM = MIETEPROQM;
    }

    public Long getMIETEWARM() {
        return MIETEWARM;
    }

    public void setMIETEWARM(Long MIETEWARM) {
        this.MIETEWARM = MIETEWARM;
    }

    public Long getNEBENKOSTEN() {
        return NEBENKOSTEN;
    }

    public void setNEBENKOSTEN(Long NEBENKOSTEN) {
        this.NEBENKOSTEN = NEBENKOSTEN;
    }

    public Long getZIMMERANZAHL() {
        return ZIMMERANZAHL;
    }

    public void setZIMMERANZAHL(Long ZIMMERANZAHL) {
        this.ZIMMERANZAHL = ZIMMERANZAHL;
    }

    public Long getWOHNFLAECHE() {
        return WOHNFLAECHE;
    }

    public void setWOHNFLAECHE(Long WOHNFLAECHE) {
        this.WOHNFLAECHE = WOHNFLAECHE;
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

    public Long getGRUNDSTUECKSFLAECHE() {
        return GRUNDSTUECKSFLAECHE;
    }

    public void setGRUNDSTUECKSFLAECHE(Long GRUNDSTUECKSFLAECHE) {
        this.GRUNDSTUECKSFLAECHE = GRUNDSTUECKSFLAECHE;
    }

    public Long getBAUJAHR() {
        return BAUJAHR;
    }

    public void setBAUJAHR(Long BAUJAHR) {
        this.BAUJAHR = BAUJAHR;
    }

    public String getETAGE() {
        return ETAGE;
    }

    public void setETAGE(String ETAGE) {
        this.ETAGE = ETAGE;
    }

    public String getENERGIEAUSWEIS() {
        return ENERGIEAUSWEIS;
    }

    public void setENERGIEAUSWEIS(String ENERGIEAUSWEIS) {
        this.ENERGIEAUSWEIS = ENERGIEAUSWEIS;
    }

    public Date getLETZTE_DEAKTIVIERUNG() {
        return LETZTE_DEAKTIVIERUNG;
    }

    public void setLETZTE_DEAKTIVIERUNG(Date LETZTE_DEAKTIVIERUNG) {
        this.LETZTE_DEAKTIVIERUNG = LETZTE_DEAKTIVIERUNG;
    }
}
