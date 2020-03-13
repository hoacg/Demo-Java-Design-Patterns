package com.codegym.structural.proxy;

public class FileMangement {

    public static void main(String[] args) {
        System.out.println("==== ADMIN ====");
        ContactManager adminProxy = new ContactManagerProxy("admin", "admin");
        adminProxy.readContacts();
        adminProxy.editContacts();

        System.out.println("==== USER ====");
        ContactManager userProxy = new ContactManagerProxy("user", "");
        userProxy.readContacts();
        userProxy.editContacts();
    }

}
