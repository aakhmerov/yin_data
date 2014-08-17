package com.yin.bigdata.api.service.tos;

import com.yin.bigdata.api.domain.entities.CurrentRealEstate;

public class OfferTo {

	private long exposeeId;
	private double prices;
	private double longitude;
	private double latitude ;
	private double size ;
	private double rooms ;
	private int constrYear ;
	private String condition;
	private String heatingType;
	private boolean balcony;
	private boolean courtage;
	private String geoCode;
	
	private OfferRisingIndicator indicator;
	
	public OfferTo( CurrentRealEstate re){
		if (re != null){
			exposeeId = re.getExposeeId();
			prices = re.getPrices();
			longitude = re.getLongitude();
			latitude = re.getLatitude();
			geoCode = re.getGeoCode();
			size = re.getSize();
			rooms = re.getRooms();
			constrYear = re.getConstrYear();
			condition = re.getCondition();
			heatingType = re.getHeatingType();
			balcony = re.isBalcony();
			courtage = re.isCourtage();
		}
	}

	public long getExposeeId() {
		return exposeeId;
	}

	public void setExposeeId(long exposeeId) {
		this.exposeeId = exposeeId;
	}

	public double getPrices() {
		return prices;
	}

	public void setPrices(double prices) {
		this.prices = prices;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getRooms() {
		return rooms;
	}

	public void setRooms(double rooms) {
		this.rooms = rooms;
	}

	public int getConstrYear() {
		return constrYear;
	}

	public void setConstrYear(int constrYear) {
		this.constrYear = constrYear;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getHeatingType() {
		return heatingType;
	}

	public void setHeatingType(String heatingType) {
		this.heatingType = heatingType;
	}

	public boolean isBalcony() {
		return balcony;
	}

	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}

	public boolean isCourtage() {
		return courtage;
	}

	public void setCourtage(boolean courtage) {
		this.courtage = courtage;
	}

	public String getGeoCode() {
		return geoCode;
	}

	public void setGeoCode(String geoCode) {
		this.geoCode = geoCode;
	}

	public OfferRisingIndicator getIndicator() {
		return indicator;
	}

	public void setIndicator(OfferRisingIndicator indicator) {
		this.indicator = indicator;
	}
	
	
}
