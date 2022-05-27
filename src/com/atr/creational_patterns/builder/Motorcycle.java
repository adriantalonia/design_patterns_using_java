package com.atr.creational_patterns.builder;

public class Motorcycle implements BuilderInterface {

    Product product = new Product();

    @Override
    public void buildBody() {
        product.add("Body Motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("1 headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
