package com.example.two.db;

import com.example.two.model.WeatherInfo;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataBase {

    List<WeatherInfo> citiesWeatherList;

    public WeatherDataBase() {
        citiesWeatherList = new ArrayList<>();
    }

    public void addAll(List<WeatherInfo> weatherInfoList) {
        citiesWeatherList.addAll(weatherInfoList);
    }

    public List<WeatherInfo> getCitiesWeatherList() {
        return citiesWeatherList;
    }
}
