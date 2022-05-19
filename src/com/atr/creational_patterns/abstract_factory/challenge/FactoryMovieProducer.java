package com.atr.creational_patterns.abstract_factory.challenge;

public class FactoryMovieProducer {
    public static AbstractMovieFactory getFactory(String type) {
        if (type == null) {
            return null;
        }

        switch (type) {
            case "HOLLYWOOD":
                return new HollywoodFactory();
            case "BOLLYWOOD":
                return new BollywoodFactory();
            default:
                throw new IllegalArgumentException("Unknown type " + type);
        }

    }
}
