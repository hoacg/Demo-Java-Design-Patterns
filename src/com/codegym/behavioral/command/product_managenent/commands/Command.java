package com.codegym.behavioral.command.product_managenent.commands;

import com.codegym.behavioral.command.product_managenent.business.Product;
import com.codegym.behavioral.command.product_managenent.business.ProductManager;

public class Command {
    protected ProductManager manager;
    public Command(ProductManager manager) {
        this.manager = manager;
    }
}
