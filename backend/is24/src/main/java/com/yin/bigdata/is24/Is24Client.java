package com.yin.bigdata.is24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.bind.JAXBContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


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
	

	public List<String> getExposees(String geoCode){
		InputStream mitte1 = this.getClass().getResourceAsStream("/mitte1.txt");
		List<String> list = new ArrayList<String>();
		BufferedReader in = new BufferedReader(new InputStreamReader(mitte1));
		String line = null;

		try {
			while((line = in.readLine()) != null) {
				list.add(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
//		List<String> list = new ArrayList<String>();
//		
//		String request = mainUrl +"api/search/v1.0/search/region?realestatetype=apartmentbuy&geocodes=" + geoCode+ "&pageSize=200";
//		LOGGER.info(request);
//		ResponseEntity<String> resp = restTemplate.getForEntity(request , String.class);
//		
//		String rbody= resp.getBody();
//		LOGGER.info(rbody);
//		try {
//			InputSource source = new InputSource(new StringReader(rbody));
//
//			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//			DocumentBuilder db = dbf.newDocumentBuilder();
//			Document document = db.parse(source);
//
//			XPathFactory xpathFactory = XPathFactory.newInstance();
//			XPath xpath = xpathFactory.newXPath();
//
//			if(document.getChildNodes().getLength() >0 ){
//				LOGGER.info(""+document.getChildNodes().getLength());
//	//			String msg = xpath.evaluate("/resultlistEntries/resultlistEntry/realEstateId]", document);
//	//			LOGGER.info(msg);
//				XPathExpression expr = xpath.compile("//resultlistEntries/resultlistEntry/realEstateId");
//				NodeList nodes= (NodeList) expr.evaluate(document, XPathConstants.NODESET);
//				for (int i = 0; i < nodes.getLength(); i++) {
//					list.add(nodes.item(i).getFirstChild().getNodeValue());
//				}
//			}
//		} catch (XPathExpressionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ParserConfigurationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SAXException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return list ;
//	}
	
	public REExpose getExposeData(String url){
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
	
	
	public REExpose getExposeData(Long exposseId) throws Exception{
		
		REExpose cre = new REExpose();
		ResponseEntity<Expose> response = restTemplate.getForEntity(mainUrl +"/api/search/v1.0/expose/" + exposseId, Expose.class);
		Expose expose = response.getBody();
		if (expose.getRealEstate() instanceof ApartmentBuy) {
			
			double longitude = 0.0;
			double latitude = 0.0;
			double prices=  ((ApartmentBuy)expose.getRealEstate()).getPrice().getValue();
			if(((ApartmentBuy)expose.getRealEstate()).getAddress() != null
					&& ((ApartmentBuy)expose.getRealEstate()).getAddress().getWgs84Coordinate() != null){
				longitude = ((ApartmentBuy)expose.getRealEstate()).getAddress().getWgs84Coordinate().getLongitude();
			    latitude = ((ApartmentBuy)expose.getRealEstate()).getAddress().getWgs84Coordinate().getLatitude();
			}
			double size = ((ApartmentBuy)expose.getRealEstate()).getLivingSpace();
			double rooms = ((ApartmentBuy)expose.getRealEstate()).getNumberOfRooms();
			int constrYear = ((ApartmentBuy)expose.getRealEstate()).getConstructionYear();
			RealEstateCondition condition = ((ApartmentBuy)expose.getRealEstate()).getCondition();
			
			
			
			if ( YesNoNotApplicableType.YES.equals(((ApartmentBuy)expose.getRealEstate()).getCourtage().getHasCourtage())){
				cre.setCourtage(true);
			}
			
			cre.setRooms(rooms);
			cre.setPrices(prices);
			cre.setLatitude(latitude);
			cre.setLongitude(longitude);
			cre.setSize(size);
			cre.setCondition(condition.name());
			cre.setConstrYear(constrYear);
			if (((ApartmentBuy)expose.getRealEstate()).getHeatingType() != null){
				cre.setHeatingType(((ApartmentBuy)expose.getRealEstate()).getHeatingType().name());
			}
			cre.setBalcony(((ApartmentBuy)expose.getRealEstate()).isBalcony());
			cre.setExposeeId(exposseId);
		}
		
		return cre;
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
}
