package com.atr.creational_patterns.builder.challenge;

public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.9f;
    }
}
