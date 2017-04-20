package com.example.design_patterns.abstract_factory;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class YellowThemeScrollBar implements ScrollBar {
    @Override
    public void draw() {
        System.out.println("Drawing yellow scroll bar");
    }
}
