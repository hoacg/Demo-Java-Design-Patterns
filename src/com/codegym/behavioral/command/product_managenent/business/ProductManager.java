package com.codegym.behavioral.command.product_managenent.business;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void remove(int index) {
        products.remove(index);
    }

    public List<Product> getProducts() {
        return this.products;
    }
}
