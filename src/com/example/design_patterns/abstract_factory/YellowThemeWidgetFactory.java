package com.example.design_patterns.abstract_factory;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class YellowThemeWidgetFactory implements WidgetFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new YellowThemeScrollBar();
    }

    @Override
    public Window createWindow() {
        return new YellowThemeWindow();
    }
}
