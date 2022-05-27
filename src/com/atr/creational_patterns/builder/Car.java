package com.atr.creational_patterns.builder;

public class Car implements BuilderInterface {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("Body Car");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("2 headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
