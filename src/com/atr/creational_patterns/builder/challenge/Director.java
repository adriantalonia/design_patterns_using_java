package com.atr.creational_patterns.builder.challenge;

public class Director {
    MealBuilder myBuilder;

    public void construct(MealBuilder builder){
        myBuilder = builder;
    }

    public void constructMeal(){
        this.myBuilder.buildBurger();
        this.myBuilder.buildDrink();
    }

    public Meal getMeal() {
        return this.myBuilder.getMeal();
    }
}
