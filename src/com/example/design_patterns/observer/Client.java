package com.example.design_patterns.observer;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class Client {
    public static void main(String[] args) {
        Button button = new Button();
        button.attachObserver(new InputText());
        button.attachObserver(new MyList());
        button.attachObserver(new OtherComponent());
        button.clicked();
    }
}
