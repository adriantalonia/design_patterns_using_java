package com.atr.creational_patterns.builder.challenge;

public abstract class CouldDrink implements Item {

    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
