package com.codegym.structural.facade.carsystem;

import com.codegym.creational.singleton.Logger;

public class Radiator {

    private static final Logger LOGGER = Logger.getInstance();

    public void on(){
        LOGGER.info("Tản nhiệt đã bật!");
    }

    public void off(){
        LOGGER.info("Tản nhiệt đã tắt!");
    }

    public void setSpeed(Integer speed){
        LOGGER.info("Đặt tốc độ tản nhiệt thành " + speed);
    }
}