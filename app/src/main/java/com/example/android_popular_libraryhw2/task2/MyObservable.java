package com.example.android_popular_libraryhw2.task2;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MyObservable implements Observable {
    public static final String MY_DEBUG = "my_debug";
    private List<Observer> listObserver;
    private String strSpam;

    public MyObservable() {
        strSpam = "Спам";
        listObserver = new ArrayList<>();
    }

    @Override
    public void registr(Observer observer) {
        listObserver.add(observer);
        Log.d(MY_DEBUG, "registr observer " + Thread.currentThread().getName());
    }

    @Override
    public void unregistr(Observer observer) {
        listObserver.remove(observer);
        Log.d(MY_DEBUG, "UNregistr observer " + Thread.currentThread().getName());
    }

    @Override
    public void notifySpam() {
        for (int i = 0; i < listObserver.size(); i++) {
            listObserver.get(i).updateData(strSpam);
            Log.d(MY_DEBUG, "SPAM " + Thread.currentThread().getName());
        }

    }
}
