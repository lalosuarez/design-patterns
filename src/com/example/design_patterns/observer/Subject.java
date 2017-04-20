package com.example.design_patterns.observer;

/**
 * Created by esuarezv on 20/04/2017.
 */
public interface Subject {
    void attachObserver(Observer observer);
    void detachObserver(Observer observer);
    void change();
}
