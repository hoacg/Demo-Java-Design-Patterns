package com.codegym.behavioral.command.calculator;

import com.codegym.behavioral.command.calculator.commands.MultiCommand;
import com.codegym.behavioral.command.calculator.commands.PlusCommand;
import com.codegym.behavioral.command.calculator.commands.SubCommand;

import java.util.Scanner;

// Client
public class MainApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số thứ 1: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Nhập vào số thứ 2: ");
        int secondNumber = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Nhập vào phép tính: ");
        char operator = scanner.nextLine().charAt(0);

        Calculator calculator;

        int result = 0;

        switch (operator) {
            case '+':
                calculator = new Calculator(new PlusCommand());
                break;
            case '-':
                calculator = new Calculator(new SubCommand());
                break;
            case '*':
                calculator = new Calculator(new MultiCommand());
                break;
            default:
                System.out.println("Chưa hỗ trợ toán tử này!");
                return;
        }

        calculator.execute(firstNumber, secondNumber);
        result = calculator.getReceiver();
        System.out.println("Kết quả là: " + result);

    }
}
