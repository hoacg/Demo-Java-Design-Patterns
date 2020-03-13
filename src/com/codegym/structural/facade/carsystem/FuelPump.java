package com.codegym.structural.facade.carsystem;

import com.codegym.creational.singleton.Logger;

public class FuelPump {

    private static final Logger LOGGER = Logger.getInstance();

    public void pump() {
        LOGGER.info("Đang bơm nhiên liệu ....");
    }
}