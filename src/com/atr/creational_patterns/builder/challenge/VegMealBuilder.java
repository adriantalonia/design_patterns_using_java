package com.atr.creational_patterns.builder.challenge;

public class VegMealBuilder implements MealBuilder {

    Meal veMeal = new Meal();
    @Override
    public void buildBurger() {
        veMeal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
        veMeal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return veMeal;
    }
}
