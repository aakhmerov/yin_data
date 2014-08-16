package com.yin.bigdata.api.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.yin.bigdata.api.service.ImportCurrentExposeeService;


@Path("/offers")
@Component
public class CurrentDataRestService {

	@Autowired
	private ImportCurrentExposeeService importCurrentExposeeService;
	
    /**
     * Check that all internals work fine together, through the status service
     */
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/load")
    public void getStatus( @RequestParam("geocode") String geocode) {
    	importCurrentExposeeService.importExposees(geocode);
    	
    }
}
