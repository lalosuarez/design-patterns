package com.example.design_patterns.factory;

/**
 * Created by esuarezv on 20/04/2017.
 */
public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.start(new BikeFactory());
        client.start(new CarFactory());
    }

    private void start(TransportFactory transportFactory) {
        System.out.println(transportFactory.create().drive());
    }
}
