package com.yin.bigdata.is24;

import java.net.URL;
import java.util.StringTokenizer;

import javax.xml.bind.JAXBContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.yin.bigdata.is24.Expose;


@Component
@Scope("singleton")
public class Is24Client{

	
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
	
	
	public Expose getExposeData(String url){
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
			
		} return null;
		
		
	}
	
	
	public Expose getExposeData(Long exposseId) throws Exception{
		
		
		ResponseEntity<Expose> response = restTemplate.getForEntity(mainUrl +"/api/search/v1.0/expose/" + exposseId, Expose.class);
		Expose expose = response.getBody();
		
		
		return expose;
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
}
