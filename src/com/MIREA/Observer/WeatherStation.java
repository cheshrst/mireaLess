package com.MIREA.Observer;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 120.0f, 4f);
        weatherData.setMeasurements(81, 120.0f, 4f);
        weatherData.setMeasurements(82, 120.0f, 4f);


    }
    //
}
