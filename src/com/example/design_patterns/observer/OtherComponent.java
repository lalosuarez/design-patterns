package com.example.design_patterns.observer;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class OtherComponent implements Observer {
    @Override
    public void update() {
        System.out.println("Hey component! button has been clicked");
    }
}
