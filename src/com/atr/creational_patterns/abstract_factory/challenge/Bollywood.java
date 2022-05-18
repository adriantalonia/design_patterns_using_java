package com.atr.creational_patterns.abstract_factory.challenge;

public interface Bollywood {
    void getMovieName();
}

class BollywoodComedyMovie implements Bollywood{

    @Override
    public void getMovieName() {
        System.out.println("BollywoodComedyMovie");
    }
}

class BollywoodActionMovie implements Bollywood {

    @Override
    public void getMovieName() {
        System.out.println("BollywoodActionMovie");
    }
}