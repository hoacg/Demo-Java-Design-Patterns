package com.codegym.creational.factory_method;

import java.util.ArrayList;
import java.util.List;

public class CandyStore {
    public static void main(String[] args) {
        CandyFactory factory = new CandyFactory(); // using

        List<Candy> candyList = new ArrayList<>();

        try {
            candyList.add( factory.makeCandy("chocolate") );
            candyList.add( factory.makeCandy("soft candy") );
            candyList.add( factory.makeCandy("weird candy") );

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println(candyList);
        }
    }
}
