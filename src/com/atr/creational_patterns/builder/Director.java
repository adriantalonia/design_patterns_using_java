package com.atr.creational_patterns.builder;

public class Director {

    BuilderInterface myBuilder;

    public void construct(BuilderInterface builder) {
        myBuilder = builder;
    }

    public void constructProduct() {
        this.myBuilder.buildBody();
        this.myBuilder.insertWheels();
        this.myBuilder.addHeadLights();
    }

    public Product getProduct() {
        return this.myBuilder.getVehicle();
    }

}
