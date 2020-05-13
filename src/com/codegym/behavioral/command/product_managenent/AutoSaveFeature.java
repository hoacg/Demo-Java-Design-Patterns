package com.codegym.behavioral.command.product_managenent;

import com.codegym.behavioral.command.product_managenent.business.Product;
import com.codegym.behavioral.command.product_managenent.business.ProductManager;
import com.codegym.behavioral.command.product_managenent.commands.SaveCommand;

import java.io.File;
import java.util.Date;

public class AutoSaveFeature implements Runnable {

    public ProductManager productManager;

    public AutoSaveFeature(ProductManager productManager) {
        this.productManager = productManager;
    }

    @Override
    public void run() {
        File file = new File("./temp-auto.txt");
        CommandInvoker commandInvoker  = new CommandInvoker(new SaveCommand(productManager, file));

        while (true) {
            commandInvoker.executeCommand();
            Date date = new Date();
            System.out.println("Auto saved at" + date.getTime());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
