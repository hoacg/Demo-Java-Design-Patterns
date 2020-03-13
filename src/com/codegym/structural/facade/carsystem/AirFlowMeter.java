package com.codegym.structural.facade.carsystem;

import com.codegym.creational.singleton.Logger;

public class AirFlowMeter {

    private static final Logger LOGGER = Logger.getInstance();

    public void getMeasurements() {
        LOGGER.info("Lấy số đo không khí ..");
    }
}