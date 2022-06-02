package com.atr.creational_patterns.prototype.challenge;

public class Nano extends BasicCar {

    public Nano(String m) {
        model = m;
    }

    @Override
    public BasicCar clone() {
        return (Nano) super.clone();
    }
}
