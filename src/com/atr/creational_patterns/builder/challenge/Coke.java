package com.atr.creational_patterns.builder.challenge;

public class Coke extends CouldDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 1.80f;
    }
}
