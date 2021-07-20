package es.uniovi.apuntesuniovi.random.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Login {
    private UUID uuid;
    private String username;
    private String password;
    private String salt;
    private String md5;
    private String sha1;
    private String sha256;

    @JsonProperty("uuid")
    public UUID getUUID() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String value) {
        this.username = value;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String value) {
        this.password = value;
    }

    @JsonProperty("salt")
    public String getSalt() {
        return salt;
    }

    @JsonProperty("salt")
    public void setSalt(String value) {
        this.salt = value;
    }

    @JsonProperty("md5")
    public String getMd5() {
        return md5;
    }

    @JsonProperty("md5")
    public void setMd5(String value) {
        this.md5 = value;
    }

    @JsonProperty("sha1")
    public String getSha1() {
        return sha1;
    }

    @JsonProperty("sha1")
    public void setSha1(String value) {
        this.sha1 = value;
    }

    @JsonProperty("sha256")
    public String getSha256() {
        return sha256;
    }

    @JsonProperty("sha256")
    public void setSha256(String value) {
        this.sha256 = value;
    }
}