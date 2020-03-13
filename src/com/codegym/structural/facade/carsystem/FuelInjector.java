package com.codegym.structural.facade.carsystem;

import com.codegym.creational.singleton.Logger;

public class FuelInjector {
    private static final Logger LOGGER = Logger.getInstance();

    private FuelPump fuelPump = new FuelPump();

    public void on(){
        LOGGER.info("Kim phun nhiên liệu đã sẵn sàng.");
    }

    public void inject() {
        fuelPump.pump();
        LOGGER.info("Nhiên liệu đã phun.");
    }

    public void off() {
        LOGGER.info("Dừng phun nhiên liệu ..");
    }
}