package com.codegym.behavioral.observer.facebook;

import java.util.ArrayList;
import java.util.List;

public class Fanpage implements ISubject {

    private List<IObserver<String>> likedUsers = new ArrayList<>();

    @Override
    public void addLikedUser(IObserver observer) {
        likedUsers.add(observer);
    }

    @Override
    public void removeLikedUser(IObserver observer) {
        likedUsers.remove(observer);
    }

    @Override
    public void doNotify(String status) {
        for (IObserver<String> user : likedUsers) {
            user.update(status);
        }
    }
}
