package com.example.design_patterns.factory;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class CarFactory extends TransportFactory {
    @Override
    public Transport create() {
        return new Car();
    }
}
