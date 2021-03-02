package es.uniovi.apuntesuniovi.random.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
  private Street street;
  private String city;
  private String state;
  private String country;
  private long postcode;
  private Coordinates coordinates;
  private Timezone timezone;

  @JsonProperty("street")
  public Street getStreet() {
    return street;
  }

  @JsonProperty("street")
  public void setStreet(Street value) {
    this.street = value;
  }

  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(String value) {
    this.city = value;
  }

  @JsonProperty("state")
  public String getState() {
    return state;
  }

  @JsonProperty("state")
  public void setState(String value) {
    this.state = value;
  }

  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(String value) {
    this.country = value;
  }

  @JsonProperty("postcode")
  public long getPostcode() {
    return postcode;
  }

  @JsonProperty("postcode")
  public void setPostcode(long value) {
    this.postcode = value;
  }

  @JsonProperty("coordinates")
  public Coordinates getCoordinates() {
    return coordinates;
  }

  @JsonProperty("coordinates")
  public void setCoordinates(Coordinates value) {
    this.coordinates = value;
  }

  @JsonProperty("timezone")
  public Timezone getTimezone() {
    return timezone;
  }

  @JsonProperty("timezone")
  public void setTimezone(Timezone value) {
    this.timezone = value;
  }
}