package com.yin.bigdata.api.service.tos;

import java.util.List;

/**
 * Created by aakhmerov on 16/08/14.
 */
public class SectorRequestTO {
    private Long latitude;
    private Long longitude;
    private int side;
    private int sideLength;
    private List timestamps;

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public List getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(List timestamps) {
        this.timestamps = timestamps;
    }
}
