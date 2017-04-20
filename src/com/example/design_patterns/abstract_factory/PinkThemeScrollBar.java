package com.example.design_patterns.abstract_factory;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class PinkThemeScrollBar implements ScrollBar {
    @Override
    public void draw() {
        System.out.println("Drawing pink scroll bar");
    }
}
