package com.codegym.behavioral.observer.facebook;

public interface ISubject { // Fanpages

    void addLikedUser(IObserver observer); // add
    void removeLikedUser(IObserver observer); // remove

    void doNotify(String status); // notify new status

}
