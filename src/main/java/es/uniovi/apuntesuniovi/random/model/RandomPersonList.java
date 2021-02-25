package es.uniovi.apuntesuniovi.random.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RandomPersonList {
  private List<Person> results;
  private Info info;

  @JsonProperty("results")
  public List<Person> getResults() {
    return results;
  }

  @JsonProperty("results")
  public void setResults(List<Person> value) {
    this.results = value;
  }

  @JsonProperty("info")
  public Info getInfo() {
    return info;
  }

  @JsonProperty("info")
  public void setInfo(Info value) {
    this.info = value;
  }
}