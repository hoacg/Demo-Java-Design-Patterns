package com.codegym.behavioral.command.product_managenent.commands;

import com.codegym.behavioral.command.product_managenent.business.Product;
import com.codegym.behavioral.command.product_managenent.business.ProductManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddProductCommandTest {

    @Test
    void should_addProduct_when_setProduct() {

        ProductManager productManager = new ProductManager();
        AddProductCommand command = new AddProductCommand(productManager);

        Product product = new Product();
        product.setName("Test Product");

        command.setProduct(product);

        assertNotNull(command.getProduct());
        assertEquals(product, command.getProduct());
    }

    @Test
    void should_throwException_when_set_null_product() {

        ProductManager productManager = new ProductManager();
        AddProductCommand command = new AddProductCommand(productManager);

        command.setProduct(null);

        assertThrows(IllegalArgumentException.class, () -> {
            command.execute();
        });
    }
}
