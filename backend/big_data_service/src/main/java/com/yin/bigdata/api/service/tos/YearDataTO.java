package com.yin.bigdata.api.service.tos;

import com.yin.bigdata.api.domain.entities.AveragePriceObject;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by aakhmerov on 17/08/14.
 */
@XmlRootElement
public class YearDataTO {
    private int year;
    private List<AveragePriceObject> averagePriceObjects;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<AveragePriceObject> getAveragePriceObjects() {
        return averagePriceObjects;
    }

    public void setAveragePriceObjects(List<AveragePriceObject> averagePriceObjects) {
        this.averagePriceObjects = averagePriceObjects;
    }
}
