package com.yin.bigdata.api.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yin.bigdata.api.domain.entities.CurrentRealEstate;
import com.yin.bigdata.api.domain.repositories.CurrentRealEstateRepository;
import com.yin.bigdata.api.service.tos.OfferTo;
import com.yin.bigdata.is24.Is24Client;
import com.yin.bigdata.is24.REExpose;

@Service
public class ImportCurrentExposeeService {
	
	@Autowired
	private Is24Client is24Client;
	
	@Resource
	private CurrentRealEstateRepository currentRealEstateRepository;

	@Transactional
	public void importExposees(String geoCode){
		//MITTE: 1276003001046
		//KREUZBERG : 1276003001034
		
		//FH: 1276003001017
		geoCode = "1276003001046";
		List<String> ids = is24Client.getExposees(geoCode);
		for( String id: ids){
			
			if ( currentRealEstateRepository.findForIsExposeeID(Long.parseLong(id)).size() == 0){
				REExpose expose = is24Client.getExposeData("http://www.immobilienscout24.de/expose/" + id, geoCode);
				if (expose != null){
					CurrentRealEstate cre = new CurrentRealEstate();
					cre.setBalcony(expose.isBalcony());
					cre.setCondition(expose.getCondition());
					cre.setConstrYear(expose.getConstrYear());
					cre.setExposeeId(Long.parseLong(id));
					cre.setHeatingType(expose.getHeatingType());
					cre.setLatitude(expose.getLatitude());
					cre.setLongitude(expose.getLongitude());
					cre.setPrices(expose.getPrices());
					cre.setRooms(expose.getRooms());
					cre.setSize(expose.getSize());
					cre.setGeoCode(geoCode);
					currentRealEstateRepository.save(cre);
				}
			}
		}
	}
	
	public List<OfferTo> getOffers(String geocode){
		List<OfferTo> ret = new ArrayList<OfferTo>();
		List<CurrentRealEstate> offers = currentRealEstateRepository.findForGeocode(geocode);
	
		for(CurrentRealEstate offer : offers){
			ret.add(new OfferTo(offer));
		}
		return ret;
	}
}
