package com.example.design_patterns.decorator;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class IconWindow extends WindowDecorator {

    public IconWindow(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        System.out.println("Drawing icon");
        window.draw();
    }
}
