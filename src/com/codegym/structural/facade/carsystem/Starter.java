package com.codegym.structural.facade.carsystem;

import com.codegym.creational.singleton.Logger;

public class Starter {

    private static final Logger LOGGER = Logger.getInstance();

    public void start() {
        LOGGER.info("Bắt đầu..");
    }
}