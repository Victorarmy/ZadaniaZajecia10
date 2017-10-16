package com.example.two.model;

import java.io.Serializable;

public class WeatherInfo implements Serializable {

    private String city;
    private String descriptioin;
    private int temerature;

    public WeatherInfo(String city, String descriptioin, int temerature) {
        this.city = city;
        this.descriptioin = descriptioin;
        this.temerature = temerature;
    }

    public String getCity() {
        return city;
    }

    public String getDescriptioin() {
        return descriptioin;
    }

    public int getTemerature() {
        return temerature;
    }

    @Override
    public String toString() {
        return "WeatherInfo{" +
                "city='" + city + '\'' +
                ", descriptioin='" + descriptioin + '\'' +
                ", temerature=" + temerature +
                '}';
    }
}
