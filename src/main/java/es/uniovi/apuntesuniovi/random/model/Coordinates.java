package es.uniovi.apuntesuniovi.random.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coordinates {
    private String latitude;
    private String longitude;

    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(String value) {
        this.latitude = value;
    }

    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(String value) {
        this.longitude = value;
    }
}