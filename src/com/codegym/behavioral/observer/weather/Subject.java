package com.codegym.behavioral.observer.weather;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void doNotify();
}
