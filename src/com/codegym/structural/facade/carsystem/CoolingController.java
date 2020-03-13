package com.codegym.structural.facade.carsystem;


import com.codegym.creational.singleton.Logger;

public class CoolingController {
    private static final Logger LOGGER = Logger.getInstance();
    private static final Integer DEFAULT_RADIATOR_SPEED = 10;

    private Integer temperatureUpperLimit;
    private Radiator radiator = new Radiator();
    private TemperatureSensor temperatureSensor = new TemperatureSensor();

    public void setTemperatureUpperLimit(Integer temperatureUpperLimit) {
        LOGGER.log("Đặt giới hạn nhiệt độ tới " + temperatureUpperLimit);
        this.temperatureUpperLimit = temperatureUpperLimit;
    }

    public void run() {
        LOGGER.log("Bộ điều khiển làm mát đã sẵn sàng!");
        radiator.setSpeed(DEFAULT_RADIATOR_SPEED);
    }

    public void cool(Integer maxAllowedTemp) {
        LOGGER.log("Làm mát theo lịch trình với nhiệt độ tối đa cho phép " + maxAllowedTemp);
        temperatureSensor.getTemperature();
        radiator.on();
    }

    public void stop() {
        LOGGER.log("Dừng điều khiển làm mát..");
        radiator.off();
    }
}
