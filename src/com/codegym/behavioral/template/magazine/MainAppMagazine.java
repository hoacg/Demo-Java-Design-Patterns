package com.codegym.behavioral.template.magazine;

import java.util.Scanner;

public class MainAppMagazine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn trang web bạn muốn xem: ");
        System.out.println("1. tuoitre.vn");
        System.out.println("2. vnexpress.net");
        System.out.print("Lựa chọn >>");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Template tuoitre = new Tuoitre();
                tuoitre.show();
                break;
            case 2:
                Template vnexpress = new Vnexpress();
                vnexpress.show();
                break;
            default:
                System.out.println("Chưa hỗ trợ!");
                break;
        }

    }

}
