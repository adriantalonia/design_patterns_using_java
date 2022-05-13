package com.atr.creational_patterns.factory.static_creator;

import com.atr.creational_patterns.factory.abstract_creator.Shape;

public interface ShapeStatic {
    void draw();
}

class Rectangle implements ShapeStatic {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Square implements ShapeStatic {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

class Circle implements ShapeStatic {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}