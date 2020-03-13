package com.codegym.structural.facade;

public class CarEngineTest {

    public static void main(String[] args) {

        CarEngineFacade carEngineFacade = new CarEngineFacade();

        carEngineFacade.startEngine();
        carEngineFacade.stopEngine();

    }
}
