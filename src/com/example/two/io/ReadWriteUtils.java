package com.example.two.io;

import com.example.two.model.WeatherInfo;
import com.example.two.utils.WeatherApi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWriteUtils {

    private static final String FILE_PATH = "C:\\Users\\Marcin\\IdeaProjects\\ZadaniaZajecia10\\src\\cities.txt";
    private static final String FILE_EXTENSION = ".csv";
    private Scanner scanner;
    private WeatherApi weatherApi;
    private ObjectOutputStream objectOutputStream;
    private String resultFileName;

    public ReadWriteUtils() throws FileNotFoundException {
        scanner = new Scanner(new File(FILE_PATH));
        weatherApi = new WeatherApi();
    }

    public List<WeatherInfo> downloadAllCitiesWeatherInfo() throws IOException {
        List<WeatherInfo> resultList = new ArrayList<>();
        while (scanner.hasNext()) {
            String cityName = scanner.nextLine();
            String cityDescription = weatherApi.getDescription(cityName);
            int cityTemperature = weatherApi.getTemperature(cityName);
            resultList.add(new WeatherInfo(cityName, cityDescription, cityTemperature));
        }
        return resultList;
    }


    public void saveToFile(WeatherInfo weatherInfo) throws IOException {
        resultFileName = weatherInfo.getCity() + ";" + weatherInfo.getTemerature() + ";" + weatherInfo.getDescriptioin();
        resultFileName += FILE_EXTENSION;
        objectOutputStream = new ObjectOutputStream(new FileOutputStream(resultFileName));
        objectOutputStream.writeObject(weatherInfo);
        objectOutputStream.close();
    }

    public void closeResources() {
        scanner.close();
    }
}
