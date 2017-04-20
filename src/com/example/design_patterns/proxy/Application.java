package com.example.design_patterns.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class Application {
    private List<Image> images = new ArrayList<>();

    public Application(List<Image> images) {
        this.images = images;
    }

    public void draw() {
        for (Image image : images) {
            image.draw();
        }
    }
}
