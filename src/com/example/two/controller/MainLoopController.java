package com.example.two.controller;

import com.example.two.db.WeatherDataBase;
import com.example.two.io.ReadWriteUtils;
import com.example.two.model.WeatherInfo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class MainLoopController {

    private ReadWriteUtils readWriteUtils;
    private WeatherDataBase dataBase;

    public MainLoopController() throws FileNotFoundException {
        readWriteUtils = new ReadWriteUtils();
        dataBase = new WeatherDataBase();
    }

    public void start() {
        try {
            List<WeatherInfo> weatherInfoList = readWriteUtils.downloadAllCitiesWeatherInfo();
            dataBase.addAll(weatherInfoList);
            List<WeatherInfo> downloadedWeatherInfoList = dataBase.getCitiesWeatherList();
            downloadedWeatherInfoList.forEach(System.out::println);
            for (WeatherInfo weatherInfo : downloadedWeatherInfoList) {
                readWriteUtils.saveToFile(weatherInfo);
            }
        } catch (IOException e) {
            System.err.println("Błąd odczytu/zapisu");
            e.printStackTrace();
        } finally {
            readWriteUtils.closeResources();
        }
    }
}
