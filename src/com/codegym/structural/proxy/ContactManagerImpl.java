package com.codegym.structural.proxy;

public class ContactManagerImpl implements ContactManager {
    @Override
    public void readContacts() {
        System.out.println("Danh bạ có nội dung...");
    }

    @Override
    public void editContacts() {
        System.out.println("Đã sửa đổi danh bạ...");
    }
}
