package com.codegym.structural.facade.carsystem;

import com.codegym.creational.singleton.Logger;

public class CatalyticConverter {

    private static final Logger LOGGER = Logger.getInstance();

    public void on() {
        LOGGER.info("Chuyển đổi Xúc tác được bật!");
    }

    public void off() {
        LOGGER.info("Chuyển đổi xúc tác đã tắt!");
    }
}