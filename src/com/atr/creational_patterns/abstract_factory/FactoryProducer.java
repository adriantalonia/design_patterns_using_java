package com.atr.creational_patterns.abstract_factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if(choice == null) {
            return null;
        }

        switch (choice) {
            case "SHAPE":
                return new ShapeFactory();
            case "COLOR":
                return new ColorFactory();

            default:
                throw new IllegalArgumentException("Unknown choice " + choice);
        }
    }
}
