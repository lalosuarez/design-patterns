package com.example.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class Button implements Subject {

    private List<Observer> observers = new ArrayList<>();

    public void clicked() {
        change();
    }

    @Override
    public void attachObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void change() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
