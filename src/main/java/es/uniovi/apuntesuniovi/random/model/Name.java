package es.uniovi.apuntesuniovi.random.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Name {
  private String title;
  private String first;
  private String last;

  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String value) {
    this.title = value;
  }

  @JsonProperty("first")
  public String getFirst() {
    return first;
  }

  @JsonProperty("first")
  public void setFirst(String value) {
    this.first = value;
  }

  @JsonProperty("last")
  public String getLast() {
    return last;
  }

  @JsonProperty("last")
  public void setLast(String value) {
    this.last = value;
  }
}