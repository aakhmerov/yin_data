package com.yin.bigdata.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yin.bigdata.api.domain.entities.EstateObject;
import com.yin.bigdata.api.domain.repositories.ObjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.yin.bigdata.api.domain.entities.RealEstates;
import com.yin.bigdata.api.domain.entities.RealEstatesHist;
import com.yin.bigdata.api.domain.repositories.RealEstatesHistRepository;
import com.yin.bigdata.api.domain.repositories.RealEstatesRepository;

/**
 * Created by aakhmerov on 16/08/14.
 */
@Path("/data")
@Component
public class AllDataRestService {
    @Autowired
    private ObjectsRepository objectsRepository;

    @Autowired
    private RealEstatesHistRepository realEstatesHistRepository;

    @Autowired
    private RealEstatesRepository realEstatesRepository;

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/all1")
    public Iterable<RealEstatesHist> getAll() {
        Page<RealEstatesHist> p1 = this.realEstatesHistRepository.findAll(new PageRequest(1, 20));
        return p1.getContent();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/all2")
    public Iterable<RealEstates> getAll2() {
        Page <RealEstates> p1 = this.realEstatesRepository.findAll(new PageRequest(1, 20));
        return p1.getContent();
    }
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/all3")
    public Iterable<EstateObject> getAll3() {
        Page <EstateObject> p1 = this.objectsRepository.findAll(new PageRequest(1, 20));
        return p1.getContent();
    }
}
