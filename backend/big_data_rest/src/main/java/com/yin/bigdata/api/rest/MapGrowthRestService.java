package com.yin.bigdata.api.rest;

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

/**
 * Created by aakhmerov on 16/08/14.
 */
@Path("/growth")
@Component
public class MapGrowthRestService {

    @Autowired
    private MapGrowthService mapGrowthService;

    @PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/historical")
    public Iterable<SectorTO> getSectorGrowth(SectorRequestTO request) {
        return mapGrowthService.getSectorGrowth(request);
    }
}
