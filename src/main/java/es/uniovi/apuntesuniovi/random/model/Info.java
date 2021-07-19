package es.uniovi.apuntesuniovi.random.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Info {
    private String seed;
    private long results;
    private long page;
    private String version;

    @JsonProperty("seed")
    public String getSeed() {
        return seed;
    }

    @JsonProperty("seed")
    public void setSeed(String value) {
        this.seed = value;
    }

    @JsonProperty("results")
    public long getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(long value) {
        this.results = value;
    }

    @JsonProperty("page")
    public long getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(long value) {
        this.page = value;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String value) {
        this.version = value;
    }
}