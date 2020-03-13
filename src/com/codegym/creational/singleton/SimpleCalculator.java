package com.codegym.creational.singleton;

import java.io.IOException;

public class SimpleCalculator {

    public int sum(int a, int b) throws IOException {
        Logger logger = Logger.getInstance();
        System.out.println(logger.toString());

        logger.log(a);
        logger.log(b);
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}
