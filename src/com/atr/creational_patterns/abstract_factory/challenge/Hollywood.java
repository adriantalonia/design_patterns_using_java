package com.atr.creational_patterns.abstract_factory.challenge;

public interface Hollywood {
    void getMovieName();
}

class HollywoodComedyMovie implements Hollywood{

    @Override
    public void getMovieName() {
        System.out.println("HollywoodComedyMovie");
    }
}

class HollywoodActionMovie implements Hollywood {

    @Override
    public void getMovieName() {
        System.out.println("HollywoodActionMovie");
    }
}