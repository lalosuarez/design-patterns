package com.example.design_patterns.proxy;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class ImageProxy extends Image {
    private Image image;

    public ImageProxy(String url) {
        super();
        this.url = url;
    }

    @Override
    public void draw() {
        if (this.image == null) {
            this.image = new Image(this.url);
        }
        image.draw();
    }
}
