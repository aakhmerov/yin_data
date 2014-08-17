package com.yin.bigdata.api.service;

import com.yin.bigdata.api.domain.entities.AveragePriceObject;
import com.yin.bigdata.api.domain.entities.EstateObject;
import com.yin.bigdata.api.domain.repositories.AveragePriceObjectRepository;
import com.yin.bigdata.api.domain.repositories.ObjectsRepository;
import com.yin.bigdata.api.service.tos.SectorRequestTO;
import com.yin.bigdata.api.service.tos.SectorTO;
import com.yin.bigdata.api.service.tos.YearDataTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aakhmerov on 16/08/14.
 */
@Service
public class MapGrowthService {

    @Autowired
    private AveragePriceObjectRepository averagePriceObjectRepository;

    /**
     * get growth ratios on monthly basis in specific district of town
     *
     *
     * @param request
     * @return
     */
    public List<SectorTO> getSectorGrowth(SectorRequestTO request) {
        List <AveragePriceObject> avgPrice = (List<AveragePriceObject>) averagePriceObjectRepository.findAll();
        HashMap <String, HashMap<Integer,AveragePriceObject>> sectorMap = new HashMap<String, HashMap<Integer,AveragePriceObject>>();
        for (AveragePriceObject obj : avgPrice) {
            String sector = obj.getGeox() + "-" + obj.getGeoy();
            HashMap <Integer,AveragePriceObject> yearMap = sectorMap.get(sector);
            if (yearMap == null) {
                yearMap = new HashMap<Integer, AveragePriceObject>();
                sectorMap.put(sector,yearMap);
            }
            yearMap.put(obj.getDate_part(),obj);
        }
        return mapResults(sectorMap);
    }

    private List<SectorTO> mapResults(HashMap<String, HashMap<Integer, AveragePriceObject>> all) {
        List<SectorTO> result = new ArrayList<SectorTO>();
        for (Map.Entry<String, HashMap<Integer,AveragePriceObject>> entry : all.entrySet()) {
            SectorTO toAdd = new SectorTO();
            toAdd.setSectorId(entry.getKey());

            toAdd.setYearDataTOList(entry.getValue());
            result.add(toAdd);
        }
        return result;
    }


}
