package com.example.recyclerviewht;

public class State {

    private String name;
    private String country;
    private int photo;


    public State(String name, String country, int photo) {
        this.name = name;
        this.country = country;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
