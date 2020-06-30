package com.example.android_popular_libraryhw2.task2;

public interface Observable {
    void registr(Observer observer);
    void unregistr(Observer observer);
    void notifySpam();

}
