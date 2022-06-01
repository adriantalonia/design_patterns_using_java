package com.atr.creational_patterns.builder.challenge;

public class Client {

    public static void main(String[] args) {
        System.out.println("+++ Meal Pattern Demo+++\n");

        Director director = new Director();
        MealBuilder vegMealBuilder = new VegMealBuilder();
        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();

        director.construct(vegMealBuilder);
        director.constructMeal();
        Meal vegMeal = director.getMeal();

        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: "+vegMeal.getCost());

        director.construct(nonVegMealBuilder);
        director.constructMeal();
        Meal nonVegMeal = director.getMeal();

        System.out.println("nonVeg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost: "+nonVegMeal.getCost());
    }
}
