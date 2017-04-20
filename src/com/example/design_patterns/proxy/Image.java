package com.example.design_patterns.proxy;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class Image {
    protected String url;

    public Image() {
    }

    public Image(String url) {
        System.out.println("Loading image...");
        this.url = url;
    }

    public void draw() {
        System.out.println("Draw image from url: " + this.url);
    }
}
