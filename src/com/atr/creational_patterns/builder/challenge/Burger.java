package com.atr.creational_patterns.builder.challenge;

public abstract class Burger implements Item {

    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
