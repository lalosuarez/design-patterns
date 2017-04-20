package com.example.design_patterns.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class Client {
    public static void main(String[] args) {
        ImageProxy image1 = new ImageProxy("google.com/image1");
        ImageProxy image2 = new ImageProxy("google.com/image2");
        ImageProxy image3 = new ImageProxy("google.com/image3");

        List<Image> images = new ArrayList<>();
        images.add(image1);
        images.add(image2);
        images.add(image3);

        Application application = new Application(images);
        System.out.println("Application setup");
        application.draw();
    }
}
