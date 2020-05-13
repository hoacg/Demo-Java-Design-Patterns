package com.codegym.behavioral.command.product_managenent;

import com.codegym.behavioral.command.product_managenent.commands.ICommand;

public class CommandInvoker {
    private ICommand command;

    public CommandInvoker() {}

    public CommandInvoker(ICommand command) {
        this.command = command;
    }

    public void executeCommand() {
        if (this.command != null)
            this.command.execute();
    }
}
