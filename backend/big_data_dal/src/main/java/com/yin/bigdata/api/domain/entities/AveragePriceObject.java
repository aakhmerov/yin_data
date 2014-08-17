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
    private Long avg;
    private Integer date_part;

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

    public Long getAvg() {
        return avg;
    }

    public void setAvg(Long avg) {
        this.avg = avg;
    }

    public Integer getDate_part() {
        return date_part;
    }

    public void setDate_part(Integer date_part) {
        this.date_part = date_part;
    }
}
