package com.yin.bigdata.api.domain.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.yin.bigdata.api.domain.entities.CurrentRealEstate;


public interface CurrentRealEstateRepository extends PagingAndSortingRepository<CurrentRealEstate,Long> {

	
	@Query("SELECT e FROM CurrentRealEstate e WHERE e.exposeeId = (:exposeeId)")
	public List<CurrentRealEstate> findForIsExposeeID(@Param("exposeeId") long exposeeId);
	
	@Query("SELECT e FROM CurrentRealEstate e WHERE e.geoCode = (:geocode)")
	public List<CurrentRealEstate> findForGeocode(@Param("geocode") String geocode);
	

}
