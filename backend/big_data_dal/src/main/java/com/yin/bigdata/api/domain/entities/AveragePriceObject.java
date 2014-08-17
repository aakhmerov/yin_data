package com.yin.bigdata.api.domain.entities;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by aakhmerov on 17/08/14.
 */
@Entity
@XmlRootElement
@Table (name = "yin_data.v_avg_price_per_cell_year")
public class AveragePriceObject extends AbstractPersistable<Long> {
    private Long geox;
    private Long geoy;
    private Long kp;
    private Integer year;

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

    public Long getKp() {
        return kp;
    }

    public void setKp(Long kp) {
        this.kp = kp;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
