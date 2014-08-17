package com.yin.bigdata.api.service;

import com.yin.bigdata.api.domain.entities.EstateObject;
import com.yin.bigdata.api.domain.repositories.ObjectsRepository;
import com.yin.bigdata.api.service.tos.SectorRequestTO;
import com.yin.bigdata.api.service.tos.SectorTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by aakhmerov on 16/08/14.
 */
@Service
public class MapGrowthService {

    @Autowired
    private ObjectsRepository objectsRepository;

    /**
     * get growth ratios on monthly basis in specific district of town
     *
     *
     * @param request
     * @return
     */
    public Iterable<SectorTO> getSectorGrowth(SectorRequestTO request) {

        List<SectorTO> growth = mapResults(objectsRepository.findAll());
        return growth;
    }

    private List<SectorTO> mapResults(Iterable<EstateObject> all) {
        return null;
    }


}
