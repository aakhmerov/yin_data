package com.yin.bigdata.api.service;

import com.yin.bigdata.api.domain.repositories.ObjectsRepository;
import com.yin.bigdata.api.service.tos.SkylinesTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by aakhmerov on 17/08/14.
 */
@Service
public class ObjectsService {
    @Autowired
    private ObjectsRepository objectsRepository;

    public SkylinesTO getSkylines() {
        SkylinesTO result = new SkylinesTO();
        result.setObjectList(objectsRepository.findSkyline());
        return result;
    }
}
