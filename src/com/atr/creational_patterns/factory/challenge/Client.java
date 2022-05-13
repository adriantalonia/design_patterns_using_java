package com.atr.creational_patterns.factory.challenge;

public class Client {

    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal tiger = factory.getAnimalType("TIGER");
        tiger.eat();
        Animal duck = factory.getAnimalType("DUCK");
        duck.eat();
    }
}
