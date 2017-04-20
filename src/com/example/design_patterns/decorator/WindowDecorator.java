package com.example.design_patterns.decorator;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class WindowDecorator extends Window {
    protected Window window;

    public WindowDecorator(Window window) {
        this.window = window;
    }

    @Override
    public void draw() {
        window.draw();
    }
}