package es.uniovi.apuntesuniovi.random.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Timezone {
  private String offset;
  private String description;

  @JsonProperty("offset")
  public String getOffset() {
    return offset;
  }

  @JsonProperty("offset")
  public void setOffset(String value) {
    this.offset = value;
  }

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String value) {
    this.description = value;
  }
}