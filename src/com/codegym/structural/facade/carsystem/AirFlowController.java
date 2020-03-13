package com.codegym.structural.facade.carsystem;

import com.codegym.creational.singleton.Logger;

public class AirFlowController {

    private static final Logger LOGGER = Logger.getInstance();
    private AirFlowMeter airFlowMeter = new AirFlowMeter();

    public void takeAir() {
        airFlowMeter.getMeasurements();
        LOGGER.info("Không khí được cung cấp!");
    }

    public void off() {
        LOGGER.info("Bộ điều khiển không khí đã tắt.");
    }
}