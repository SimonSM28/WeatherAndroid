package com.simon.myapplication;

public class City {
    String name;
    int temperature;
    String wind;
    int humidity;
    int preasure;

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getWind() {
        return wind;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPreasure() {
        return preasure;
    }

    public City(String name, int temperature, String wind, int humidity, int preasure) {
        this.name = name;
        this.temperature = temperature;
        this.wind = wind;
        this.humidity = humidity;
        this.preasure = preasure;
    }
}
