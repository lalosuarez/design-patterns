package com.example.design_patterns.decorator;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class Client {
    public static void main(String[] args) {
        Window window = new Window();
        IconWindow iconWindow = new IconWindow(window);
        ScrollBarWindow scrollBarWindow = new ScrollBarWindow(iconWindow);

        System.out.println("====================");
        draw(scrollBarWindow);
        System.out.println("====================");
        draw(iconWindow);
    }

    public static void draw(Window window) {
        window.draw();
    }
}
