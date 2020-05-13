package com.codegym.behavioral.command.product_managenent.commands;

import com.codegym.behavioral.command.product_managenent.business.Product;
import com.codegym.behavioral.command.product_managenent.business.ProductManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class SaveCommand extends Command implements ICommand {

    private File file;

    public SaveCommand(ProductManager manager, File file) {
        super(manager);
        this.file = file;
    }

    @Override
    public void execute() {
        List<Product> products = this.manager.getProducts();

        FileOutputStream stream = null;
        try {
            stream = new FileOutputStream(file);
            for (Product product: products) {
                byte[] bytes = convertProductToString(product).getBytes();
                stream.write(bytes);
            }
            if (stream != null) stream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String convertProductToString(Product product) {
        StringBuilder builder = new StringBuilder();
        builder.append(product.getName());
        builder.append("\n");
        return builder.toString();
    }
}
