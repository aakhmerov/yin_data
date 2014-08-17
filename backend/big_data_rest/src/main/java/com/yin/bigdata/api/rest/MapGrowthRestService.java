package com.yin.bigdata.api.rest;

import com.yin.bigdata.api.domain.entities.AveragePriceObject;
import com.yin.bigdata.api.domain.entities.RealEstatesHist;
import com.yin.bigdata.api.service.MapGrowthService;
import com.yin.bigdata.api.service.tos.SectorRequestTO;
import com.yin.bigdata.api.service.tos.SectorTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by aakhmerov on 16/08/14.
 */
@Path("/growth")
@Component
public class MapGrowthRestService {

    @Autowired
    private MapGrowthService mapGrowthService;

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/historical")
    public java.util.List<SectorTO> getSectorGrowth() {
        return mapGrowthService.getSectorGrowth(null);
    }
}
