package com.yin.bigdata.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yin.bigdata.api.domain.repositories.ObjectsRepository;
import com.yin.bigdata.api.service.ObjectsService;
import com.yin.bigdata.api.service.tos.SkylinesTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yin.bigdata.api.service.ImportCurrentExposeeService;
import com.yin.bigdata.api.service.tos.BasicOfferTO;


@Path("/offers")
@Component
public class CurrentDataRestService {

    @Autowired
    private ObjectsService objectsRepository;

	@Autowired
	private ImportCurrentExposeeService importCurrentExposeeService;
	
    /**
     * Check that all internals work fine together, through the status service
     */
    @GET
    @Produces({ MediaType.APPLICATION_XML})
    @Path("/load")
    public void getStatus( ) {
    	importCurrentExposeeService.importExposees("1276003001046");
    	
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/")
    public BasicOfferTO getSectorGrowth() {
    	
    	BasicOfferTO ret = new BasicOfferTO();
    	ret.setOffers(importCurrentExposeeService.getOffers("1276003001046"));
        return ret;
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/skylines")
    public SkylinesTO getSkylines() {
        return objectsRepository.getSkylines();
    }
}