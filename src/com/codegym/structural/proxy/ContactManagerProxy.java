package com.codegym.structural.proxy;

public class ContactManagerProxy implements ContactManager {

    private String username = "admin";
    private String password = "admin";
    private boolean isLoggedIn = false;

    ContactManagerImpl contactManager;

    public ContactManagerProxy(String username, String password) {
        contactManager = new ContactManagerImpl();

        if (username.equals(this.username) && password.equals(this.password)) {
            this.isLoggedIn = true;
        }
    }

    @Override
    public void readContacts() {
        contactManager.readContacts();
    }

    @Override
    public void editContacts() {
        // kiểm tra đã đăng nhập chưa?

        if (isLogin()) {
            // nếu đăng nhập rồi:
            contactManager.editContacts();
        } else {
            // chưa đăng nhập:
            System.out.println("Không có quyền sửa danh bạ!");
        }
    }

    private boolean isLogin() {
        return (isLoggedIn == true);
    }
}
