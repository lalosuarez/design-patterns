package com.example.design_patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class GraphicItemGroup implements Graphic {

    private List<Graphic> graphics = new ArrayList<>();

    @Override
    public void draw() {
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }

    public List<Graphic> getGraphics() {
        return graphics;
    }
}
