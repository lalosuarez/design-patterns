package com.example.design_patterns.observer;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class MyList implements Observer {
    public void setListValue(int value) {
        System.out.println("Setting list value: " + value);
    }

    @Override
    public void update() {
        System.out.println("Hey list! button has been clicked");
        //setListValue(1);
    }
}
