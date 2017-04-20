package com.example.design_patterns.composite;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class Client {
    public static void main(String[] args) {
        GraphicItemGroup gig1 = new GraphicItemGroup();
        gig1.getGraphics().add(new Line());
        gig1.getGraphics().add(new Rectangle());
        System.out.println("Group 1");
        gig1.draw();

        GraphicItemGroup gig2 = new GraphicItemGroup();
        gig2.getGraphics().add(gig1);
        gig2.getGraphics().add(new Line());
        gig2.getGraphics().add(new Line());
        System.out.println("Group 2");
        gig2.draw();
    }
}
