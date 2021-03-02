package es.uniovi.apuntesuniovi.random.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public class Dob {
  private OffsetDateTime date;
  private long age;

  @JsonProperty("date")
  public OffsetDateTime getDate() {
    return date;
  }

  @JsonProperty("date")
  public void setDate(OffsetDateTime value) {
    this.date = value;
  }

  @JsonProperty("age")
  public long getAge() {
    return age;
  }

  @JsonProperty("age")
  public void setAge(long value) {
    this.age = value;
  }
}