package com.yin.bigdata.api.service.tos;

import com.yin.bigdata.api.domain.entities.AveragePriceObject;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aakhmerov on 16/08/14.
 */
@XmlRootElement
public class BasicOfferTO {
   
    private List<OfferTo> offers;

	public List<OfferTo> getOffers() {
		return offers;
	}

	public void setOffers(List<OfferTo> offers) {
		this.offers = offers;
	}

    
}
