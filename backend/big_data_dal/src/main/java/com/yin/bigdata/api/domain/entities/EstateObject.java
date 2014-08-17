package com.yin.bigdata.api.domain.entities;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by aakhmerov on 16/08/14.
 */
@Entity
@XmlRootElement
@Table(name = "yin_data.t_objects")
public class EstateObject {
    @Id ()
    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    @Column(name = "o_id")
    private Long id;
    private Long obid;
    private Integer ok2id;
    private Long geox;
    private Long geoy;
    private Integer bgid;
    private String strasse;
    private String hausnr;
    private String plz;
    private String ort;
    private Long wohnflaeche;
    private Long zimmeranzahl;
    private Integer baujahr;
    private String courtage;
    private Long kaufpreis;
    private Boolean kaufvermietet;
    private Long nebenkosten;
    private Long zusatzkosten;
    private String ueberschrift;
    private String url;
    private Date edatum;
    private Long parkflaechenzahl;
    private Long parkflaechenpreis;
    private String etage;
    private Long mieteinnahmenpromonat;
    private Long heizkosten;
    private Integer letzte_modernisierung;
    private Boolean keller;
    private Boolean barrierefrei;
    private Boolean denkmalobjekt;
    @Column(name = "o_is_skyline")
    private Boolean isSkyline;
    @Column(name = "o_dominated_by")
    private Long dominatedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getObid() {
        return obid;
    }

    public void setObid(Long obid) {
        this.obid = obid;
    }

    public Integer getOk2id() {
        return ok2id;
    }

    public void setOk2id(Integer ok2id) {
        this.ok2id = ok2id;
    }

    public Long getGeox() {
        return geox;
    }

    public void setGeox(Long geox) {
        this.geox = geox;
    }

    public Long getGeoy() {
        return geoy;
    }

    public void setGeoy(Long geoy) {
        this.geoy = geoy;
    }

    public Integer getBgid() {
        return bgid;
    }

    public void setBgid(Integer bgid) {
        this.bgid = bgid;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnr() {
        return hausnr;
    }

    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Long getWohnflaeche() {
        return wohnflaeche;
    }

    public void setWohnflaeche(Long wohnflaeche) {
        this.wohnflaeche = wohnflaeche;
    }

    public Long getZimmeranzahl() {
        return zimmeranzahl;
    }

    public void setZimmeranzahl(Long zimmeranzahl) {
        this.zimmeranzahl = zimmeranzahl;
    }

    public Integer getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(Integer baujahr) {
        this.baujahr = baujahr;
    }

    public String getCourtage() {
        return courtage;
    }

    public void setCourtage(String courtage) {
        this.courtage = courtage;
    }

    public Long getKaufpreis() {
        return kaufpreis;
    }

    public void setKaufpreis(Long kaufpreis) {
        this.kaufpreis = kaufpreis;
    }

    public Boolean getKaufvermietet() {
        return kaufvermietet;
    }

    public void setKaufvermietet(Boolean kaufvermietet) {
        this.kaufvermietet = kaufvermietet;
    }

    public Long getNebenkosten() {
        return nebenkosten;
    }

    public void setNebenkosten(Long nebenkosten) {
        this.nebenkosten = nebenkosten;
    }

    public Long getZusatzkosten() {
        return zusatzkosten;
    }

    public void setZusatzkosten(Long zusatzkosten) {
        this.zusatzkosten = zusatzkosten;
    }

    public String getUeberschrift() {
        return ueberschrift;
    }

    public void setUeberschrift(String ueberschrift) {
        this.ueberschrift = ueberschrift;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getEdatum() {
        return edatum;
    }

    public void setEdatum(Date edatum) {
        this.edatum = edatum;
    }

    public Long getParkflaechenzahl() {
        return parkflaechenzahl;
    }

    public void setParkflaechenzahl(Long parkflaechenzahl) {
        this.parkflaechenzahl = parkflaechenzahl;
    }

    public Long getParkflaechenpreis() {
        return parkflaechenpreis;
    }

    public void setParkflaechenpreis(Long parkflaechenpreis) {
        this.parkflaechenpreis = parkflaechenpreis;
    }

    public String getEtage() {
        return etage;
    }

    public void setEtage(String etage) {
        this.etage = etage;
    }

    public Long getMieteinnahmenpromonat() {
        return mieteinnahmenpromonat;
    }

    public void setMieteinnahmenpromonat(Long mieteinnahmenpromonat) {
        this.mieteinnahmenpromonat = mieteinnahmenpromonat;
    }

    public Long getHeizkosten() {
        return heizkosten;
    }

    public void setHeizkosten(Long heizkosten) {
        this.heizkosten = heizkosten;
    }

    public Integer getLetzte_modernisierung() {
        return letzte_modernisierung;
    }

    public void setLetzte_modernisierung(Integer letzte_modernisierung) {
        this.letzte_modernisierung = letzte_modernisierung;
    }

    public Boolean getKeller() {
        return keller;
    }

    public void setKeller(Boolean keller) {
        this.keller = keller;
    }

    public Boolean getBarrierefrei() {
        return barrierefrei;
    }

    public void setBarrierefrei(Boolean barrierefrei) {
        this.barrierefrei = barrierefrei;
    }

    public Boolean getDenkmalobjekt() {
        return denkmalobjekt;
    }

    public void setDenkmalobjekt(Boolean denkmalobjekt) {
        this.denkmalobjekt = denkmalobjekt;
    }

    public Boolean getIsSkyline() {
        return isSkyline;
    }

    public void setIsSkyline(Boolean isSkyline) {
        this.isSkyline = isSkyline;
    }

    public Long getDominatedBy() {
        return dominatedBy;
    }

    public void setDominatedBy(Long dominatedBy) {
        this.dominatedBy = dominatedBy;
    }
}
