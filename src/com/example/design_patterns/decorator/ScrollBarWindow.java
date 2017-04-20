package com.example.design_patterns.decorator;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class ScrollBarWindow extends WindowDecorator {

    public ScrollBarWindow(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        System.out.println("Drawing scroll bar");
        window.draw();
    }
}
