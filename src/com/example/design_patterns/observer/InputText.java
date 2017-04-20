package com.example.design_patterns.observer;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class InputText implements Observer {
    public void setText(String text) {
        System.out.println("Setting input text: " + text);
    }

    @Override
    public void update() {
        System.out.println("Hey input text! button has been clicked");
        //setText("Button has been clicked");
    }
}
