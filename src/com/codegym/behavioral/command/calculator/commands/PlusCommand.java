package com.codegym.behavioral.command.calculator.commands;

public class PlusCommand implements ICommand {
    @Override
    public int execute(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
