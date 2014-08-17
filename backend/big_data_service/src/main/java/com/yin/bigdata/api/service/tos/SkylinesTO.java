package com.yin.bigdata.api.service.tos;

import com.yin.bigdata.api.domain.entities.EstateObject;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by aakhmerov on 17/08/14.
 */
@XmlRootElement
public class SkylinesTO {
    private List<EstateObject> objectList;

    public List<EstateObject> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<EstateObject> objectList) {
        this.objectList = objectList;
    }
}
