package com.yin.bigdata.is24;

import java.math.BigDecimal;
import java.net.URL;
import java.util.StringTokenizer;

import javax.xml.bind.JAXBContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.groupestate.is24.ApartmentBuy;
import com.groupestate.is24.Attachment;
import com.groupestate.is24.Expose;
import com.groupestate.is24.HouseBuy;
import com.groupestate.is24.Picture;
import com.groupestate.is24.PictureScaleType;
import com.groupestate.is24.Picture.Urls.Url;
import com.groupestate.realestate.enums.RealEstateType;
import com.groupestate.realestateportal.RealEstatPortalExpose;
import com.groupestate.realestateportal.RealEstatePortalClient;
import com.groupestate.realestateportal.RealEstatePortalException;


@Component
@Scope("singleton")
public class Is24Client implements RealEstatePortalClient{

	
	private static final Logger LOGGER = LoggerFactory.getLogger(Is24Client.class);
	
	private static String UTF8 = "UTF-8";
	private JAXBContext jaxbContext;	
	
	
	private String mainUrl = "http://rest.immobilienscout24.de/restapi/";
	
	
	

	private RestTemplate restTemplate;
	
	public Is24Client(){
        restTemplate = new RestTemplate();
    }
	

	public boolean isUrlHandledByClient(String url) {
		if (url.contains("immobilienscout24")){
			return true;
		}
		return false;
	}
	
	@Override
	public RealEstatPortalExpose getExposeData(String url) throws RealEstatePortalException{
		try {
			
			LOGGER.info("accessing: " + url);
			URL location = new URL(url);
			StringTokenizer tokenizer = new StringTokenizer(location.getPath(), "/");
			
			String exposeeId = null;
			while (tokenizer.hasMoreElements()){
				exposeeId = tokenizer.nextToken();
			}
			
			return getExposeData( Long.parseLong(exposeeId));
		} catch (Exception e) {
			LOGGER.error("problem accessing is24", e);
			throw new RealEstatePortalException();
		} 
		
		
	}
	
	
	public RealEstatPortalExpose getExposeData(Long exposseId) throws Exception{
		
		
		ResponseEntity<Expose> response = restTemplate.getForEntity(mainUrl +"/api/search/v1.0/expose/" + exposseId, Expose.class);
		Expose expose = response.getBody();
		
		RealEstatPortalExpose repe = new RealEstatPortalExpose();
		
		LOGGER.info("expose:" + expose);
		
		repe.setTitle(expose.getRealEstate().getTitle());
		repe.setExposeUrl("https://www.immobilienscout24.de/expose/" + exposseId);
		
		if (expose.getRealEstate() instanceof HouseBuy) {
			LOGGER.info("price:" + ((HouseBuy)expose.getRealEstate()).getPrice().getValue());
			repe.setPrice(new BigDecimal(((HouseBuy)expose.getRealEstate()).getPrice().getValue()));
		}
		if (expose.getRealEstate() instanceof ApartmentBuy) {
			LOGGER.info("price:" + ((ApartmentBuy)expose.getRealEstate()).getPrice().getValue());
			repe.setPrice(new BigDecimal(((ApartmentBuy)expose.getRealEstate()).getPrice().getValue()));
		}
		
		for ( Attachment attachmt: expose.getRealEstate().getAttachments().getAttachment()){
			
			if ( attachmt instanceof Picture){
				Picture pic = (Picture)attachmt;
				if ( pic.isTitlePicture()){
					for ( Url url : pic.getUrls().getUrl()){
						
						if ( PictureScaleType.SCALE_210_X_210.equals(url.getScale())){
							repe.setMainImageUrl(url.getHref());
						}
					}
				}
			}
		}
		repe.setExposeUrl("https://www.immobilienscout24.de/expose/" + exposseId);
		repe.setType(RealEstateType.SINGLE_HOUSE);
		
		return repe;
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
}
