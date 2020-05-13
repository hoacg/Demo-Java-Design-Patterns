package com.codegym.behavioral.command.product_managenent;

import com.codegym.behavioral.command.product_managenent.business.Product;
import com.codegym.behavioral.command.product_managenent.business.ProductManager;
import com.codegym.behavioral.command.product_managenent.commands.AddProductCommand;
import com.codegym.behavioral.command.product_managenent.commands.ICommand;
import com.codegym.behavioral.command.product_managenent.commands.RemoveProductCommand;
import com.codegym.behavioral.command.product_managenent.commands.SaveCommand;
import com.codegym.behavioral.command.product_managenent.ui.ItemChooser;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Build UI

        System.out.println("================");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Xoá sản phẩm");
        System.out.println("3. Lưu sản phẩm vào file");
        System.out.println("================");
        System.out.println("Chọn chức năng: ");

        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();

        CommandInvoker commandInvoker = new CommandInvoker();
        ProductManager productManager = new ProductManager();
        switch (choose) {
            case ItemChooser.ADD:
                AddProductCommand command = new AddProductCommand(productManager);
                commandInvoker  = new CommandInvoker(command);

                // nhập dữ liệu sản phẩm
                Product product = new Product();
                product.setName("Sản phẩm được thêm [" + new Date().getTime() + "]");
                command.setProduct(product);
                break;
            case ItemChooser.REMOVE:
                commandInvoker  = new CommandInvoker(new RemoveProductCommand(productManager));
                // chọn sản phẩm cần xoá
                break;
            case ItemChooser.SAVE:
                File file = new File("./my-export-file.txt");
                commandInvoker  = new CommandInvoker(new SaveCommand(productManager, file));
                break;
            default:
                System.out.println("Lựa chọn sai!");
        }

        commandInvoker.executeCommand();

        Thread thread = new Thread(new AutoSaveFeature(productManager));
        thread.start();
    }


}
