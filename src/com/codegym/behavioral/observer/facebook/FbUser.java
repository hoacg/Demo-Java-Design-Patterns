package com.codegym.behavioral.observer.facebook;

public class FbUser implements IObserver<String> {
    @Override
    public void update(String data) {
        System.out.println(this.toString() + " - Có thông báo mới: " + data);
    }
}
