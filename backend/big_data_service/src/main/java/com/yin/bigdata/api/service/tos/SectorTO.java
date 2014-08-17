package com.yin.bigdata.api.service.tos;

import com.yin.bigdata.api.domain.entities.AveragePriceObject;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aakhmerov on 16/08/14.
 */
@XmlRootElement
public class SectorTO {
    private String sectorId;
    private HashMap<Integer, AveragePriceObject> yearDataTOList;

    public String getSectorId() {
        return sectorId;
    }

    public void setSectorId(String sectorId) {
        this.sectorId = sectorId;
    }

    public HashMap<Integer, AveragePriceObject> getYearDataTOList() {
        return yearDataTOList;
    }

    public void setYearDataTOList(HashMap<Integer, AveragePriceObject> yearDataTOList) {
        this.yearDataTOList = yearDataTOList;
    }
}
