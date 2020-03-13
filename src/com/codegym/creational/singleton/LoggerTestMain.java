package com.codegym.creational.singleton;

import java.io.IOException;
import java.util.Scanner;

public class LoggerTestMain {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        System.out.println(logger.toString());

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        System.out.println("Nhập vào số a: ");
        int soA = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        int soB = scanner.nextInt();

        int ketQua = simpleCalculator.sum(soA, soB);
        logger.log(ketQua);

        System.out.println("Kết quả là: " + ketQua);
    }
}
