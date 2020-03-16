package com.codegym.behavioral.command.calculator;

import com.codegym.behavioral.command.calculator.commands.ICommand;

// Invoker
public class Calculator {

    private ICommand command;

    private int receiver;

    Calculator(ICommand command) {
        this.command = command;
    }

    public void execute(int firstNumber, int secondNumber) {
        this.receiver = command.execute(firstNumber, secondNumber);
    }

    public int getReceiver() {
        return this.receiver;
    }
}
