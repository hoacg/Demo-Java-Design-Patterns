package com.codegym.behavioral.observer.weather;

public class WeatherCustomer implements Observer {
    String name;

    WeatherCustomer(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println("Weather customer " + this.name + " just found out the temperature is:" + temperature);
    }
}
