package com.atr.creational_patterns.factory.challenge;

public interface Animal {
    void eat();
}

class Duck implements Animal {
    @Override
    public void eat() {
        System.out.println("Duck is eating...");
    }
}

class Tiger implements Animal {
    @Override
    public void eat() {
        System.out.println("Tiger is eating...");
    }
}
