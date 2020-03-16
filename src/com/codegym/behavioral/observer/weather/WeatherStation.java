package com.codegym.behavioral.observer.weather;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WeatherStation implements Subject {
    Set<Observer> observers = new HashSet<>();
    int temperature;

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void doNotify() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(this.temperature);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.doNotify();
    }
}
