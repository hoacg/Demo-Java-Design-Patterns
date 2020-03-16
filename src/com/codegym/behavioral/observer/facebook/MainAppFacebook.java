package com.codegym.behavioral.observer.facebook;

public class MainAppFacebook {
    public static void main(String[] args) {

        Fanpage codegym = new Fanpage();

        FbUser user1 = new FbUser();
        FbUser user2 = new FbUser();
        FbUser user3 = new FbUser();

        FbUser user4 = new FbUser();
        FbUser user5 = new FbUser();

        codegym.addLikedUser(user1); // like
        codegym.addLikedUser(user2); // like
        codegym.addLikedUser(user3); // like

        System.out.println("Trước khi unlike: ");
        codegym.doNotify("Khai giảng khoá học mới vào ngày 20/03");

        System.out.println("============================");
        codegym.removeLikedUser(user2);
        System.out.println("Sau khi unlike: ");
        codegym.doNotify("Tổ chức cuộc thi Hackathon cho học viên! vào ngày 21/03");
    }
}
