package es.uniovi.apuntesuniovi.random.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private Dob dob;
    private Dob registered;
    private String phone;
    private String cell;
    private ID id;
    private Picture picture;
    private String nat;

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String value) {
        this.gender = value;
    }

    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name value) {
        this.name = value;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location value) {
        this.location = value;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String value) {
        this.email = value;
    }

    @JsonProperty("login")
    public Login getLogin() {
        return login;
    }

    @JsonProperty("login")
    public void setLogin(Login value) {
        this.login = value;
    }

    @JsonProperty("dob")
    public Dob getDob() {
        return dob;
    }

    @JsonProperty("dob")
    public void setDob(Dob value) {
        this.dob = value;
    }

    @JsonProperty("registered")
    public Dob getRegistered() {
        return registered;
    }

    @JsonProperty("registered")
    public void setRegistered(Dob value) {
        this.registered = value;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String value) {
        this.phone = value;
    }

    @JsonProperty("cell")
    public String getCell() {
        return cell;
    }

    @JsonProperty("cell")
    public void setCell(String value) {
        this.cell = value;
    }

    @JsonProperty("id")
    public ID getID() {
        return id;
    }

    @JsonProperty("id")
    public void setID(ID value) {
        this.id = value;
    }

    @JsonProperty("picture")
    public Picture getPicture() {
        return picture;
    }

    @JsonProperty("picture")
    public void setPicture(Picture value) {
        this.picture = value;
    }

    @JsonProperty("nat")
    public String getNat() {
        return nat;
    }

    @JsonProperty("nat")
    public void setNat(String value) {
        this.nat = value;
    }
}