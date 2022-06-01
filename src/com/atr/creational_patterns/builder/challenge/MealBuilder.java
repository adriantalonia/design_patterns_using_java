package com.atr.creational_patterns.builder.challenge;

public interface MealBuilder {

    void buildBurger();

    void buildDrink();

    Meal getMeal();
}
