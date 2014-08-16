package com.yin.bigdata.api.domain.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@XmlRootElement
@Table (name = "currentRealEstate")
public class CurrentRealEstate extends AbstractPersistable<Long> {

	private long exposeeId;
	private double prices;
	private double longitude;
	private double latitude ;
	private double size ;
	private double rooms ;
	private double constrYear ;
	private String condition;
	private String heatingType;
	private boolean balcony;
	private boolean courtage;
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
	public double getConstrYear() {
		return constrYear;
	}
	public void setConstrYear(double constrYear) {
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
	
	
}
