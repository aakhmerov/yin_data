package com.yin.bigdata.api.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yin.bigdata.api.domain.entities.CurrentRealEstate;
import com.yin.bigdata.api.domain.repositories.CurrentRealEstateRepository;
import com.yin.bigdata.is24.Is24Client;
import com.yin.bigdata.is24.REExpose;

@Service
public class ImportCurrentExposeeService {
	
	@Autowired
	private Is24Client is24Client;
	
	@Resource
	private CurrentRealEstateRepository currentRealEstateRepository;

	
	public void importExposees(String geoCode){
		
		List<String> ids = is24Client.getExposees(geoCode);
		for( String id: ids){
			
			if ( currentRealEstateRepository.findForIsExposeeID(Long.parseLong(id)) == null){
				REExpose expose = is24Client.getExposeData(id);
				
				CurrentRealEstate cre = new CurrentRealEstate();
				cre.setBalcony(expose.isBalcony());
				cre.setCondition(expose.getCondition());
				cre.setConstrYear(expose.getConstrYear());
				cre.setExposeeId(expose.getExposeeId());
				cre.setHeatingType(expose.getHeatingType());
				cre.setLatitude(expose.getLatitude());
				cre.setLongitude(expose.getLongitude());
				cre.setPrices(expose.getPrices());
				cre.setRooms(expose.getRooms());
				cre.setSize(expose.getSize());
				currentRealEstateRepository.save(cre);
			}
		}
	}
}
