package com.codegym.structural.adapter;

public class MovableAdapterTest {
    public static void main(String[] args) {

        Movable bugattiVeyron = new BugattiVeyron(); // MPH

        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); // Adapter pattern

        System.out.println(bugattiVeyronAdapter.getSpeed()); // KM/H
    }
}
