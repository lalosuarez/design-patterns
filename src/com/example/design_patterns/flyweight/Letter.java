package com.example.design_patterns.flyweight;

/**
 * Created by esuarezv on 21/04/2017.
 */
public class Letter {
    private String value;

    public Letter(String value) {
        System.out.println("Creating new letter with value " + value);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
