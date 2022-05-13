package com.atr.creational_patterns.factory.challenge;

public class AnimalFactory {

    public Animal getAnimalType(String animalType) {
        if (animalType == null || animalType.isEmpty())
            return null;

        switch (animalType) {
            case "TIGER":
                return new Duck();
            case "DUCK":
                return new Tiger();
            default:
                throw new IllegalArgumentException("Unknown animalType " + animalType);
        }
    }
}
