package com.codegym.creational.factory_method;


public class CandyFactory {

    public CandyFactory() {}

    public Candy makeCandy(String candyName) throws Exception {
        switch (candyName) {
            case "chocolate":
                return new Chocolate();
            case "soft candy":
                return new SoftCandy();
            case "hard candy":
                return new HardCandy();
            default:
                throw new Exception("Cannot find this candy!");
        }
    }
}
