package com.atr.creational_patterns.builder.challenge;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 35.9f;
    }
}
