package com.example.design_patterns.abstract_factory;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class PinkThemeWidgetFactory implements WidgetFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new PinkThemeScrollBar();
    }

    @Override
    public Window createWindow() {
        return new PinkThemeWindow();
    }
}
