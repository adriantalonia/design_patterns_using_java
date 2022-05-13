package com.atr.creational_patterns.factory.concrete_creator;

public interface ShapeConcrete {
    void draw();
}

class Rectangle implements ShapeConcrete {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Square implements ShapeConcrete {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

class Circle implements ShapeConcrete {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}