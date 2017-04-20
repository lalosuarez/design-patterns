package com.example.design_patterns.abstract_factory;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        //client.initializeGUI(new PinkThemeWidgetFactory());
        client.initializeGUI(new YellowThemeWidgetFactory());
    }

    public void initializeGUI(WidgetFactory widgetFactory) {
        widgetFactory.createScrollBar().draw();
        widgetFactory.createWindow().draw();
    }
}
