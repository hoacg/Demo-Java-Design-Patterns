package com.codegym.behavioral.command.product_managenent.commands;

import com.codegym.behavioral.command.product_managenent.business.Product;
import com.codegym.behavioral.command.product_managenent.business.ProductManager;

public class AddProductCommand extends Command implements ICommand {
    public Product getProduct() {
        return product;
    }

    private Product product;

    public AddProductCommand(ProductManager manager) {
        super(manager);
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public void execute() {
        if (this.product == null) throw new IllegalArgumentException();
        this.manager.add(this.product);
    }

}
