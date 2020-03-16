package com.codegym.behavioral.observer.weather;

public class MainAppWeather {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherCustomer customer1 = new WeatherCustomer("VTV1");
        WeatherCustomer customer2 = new WeatherCustomer("VTV5");

        weatherStation.addObserver(customer1);
        weatherStation.addObserver(customer2);

        weatherStation.setTemperature(41);
    }
}
