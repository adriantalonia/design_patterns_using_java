package com.atr.creational_patterns.prototype.challenge;

public class Ford extends BasicCar {

    public Ford(String m) {
        model = m;
    }

    @Override
    public BasicCar clone() {
        return (Ford) super.clone();
    }
}

