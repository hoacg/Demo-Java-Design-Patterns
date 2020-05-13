package com.codegym.behavioral.command.product_managenent.commands;

import com.codegym.behavioral.command.product_managenent.business.ProductManager;

public class RemoveProductCommand extends Command implements ICommand {

    public RemoveProductCommand(ProductManager manager) {
        super(manager);
    }

    @Override
    public void execute() {
        System.out.println("Thực hiện thao tác xoá!");
    }
}
