package com.codegym.structural.facade.carsystem;

import com.codegym.creational.singleton.Logger;

public class TemperatureSensor {
    private static final Logger LOGGER = Logger.getInstance();

    public void getTemperature(){
        LOGGER.info("Lấy nhiệt độ từ cảm biến..");
    }

}