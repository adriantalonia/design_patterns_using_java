package com.atr.creational_patterns.builder.challenge;

public class Pepsi extends CouldDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 1.50f;
    }
}
