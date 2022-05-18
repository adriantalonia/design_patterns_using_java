package com.atr.creational_patterns.abstract_factory.challenge;

public class ClientMovie {

    public static void main(String[] args) {

        AbstractMovieFactory hollywoodFactory = FactoryMovieProducer.getFactory("HOLLYWOOD");
        Hollywood action = hollywoodFactory.getHollywoodMovie("ACTION");
        action.getMovieName();

        AbstractMovieFactory bollywoodFactory = FactoryMovieProducer.getFactory("BOLLYWOOD");
        Bollywood comedy = bollywoodFactory.getBollywoodMovie("COMEDY");
        comedy.getMovieName();


    }
}
