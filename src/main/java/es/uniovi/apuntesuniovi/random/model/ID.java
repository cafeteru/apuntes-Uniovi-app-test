package es.uniovi.apuntesuniovi.random.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ID {
    private String name;
    private String value;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String value) {
        this.name = value;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }
}