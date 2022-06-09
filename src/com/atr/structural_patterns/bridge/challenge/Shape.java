package com.atr.structural_patterns.bridge.challenge;

abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    abstract void drawShape(int border);

    abstract void modifyBorder(int border, int increment);
}

class Rectangle extends Shape {
    protected Rectangle(Color color) {
        super(color);
    }

    // Implementer-specific method
    @Override
    void drawShape(int border) {
        System.out.println("This rectangle is colored with ");
        color.fillWithColor(border);
    }

    // Abstraction-specific method
    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length " + increment + " times");
        border *= increment;
        drawShape(border);
    }


}

class Triangle extends Shape {

    protected Triangle(Color color) {
        super(color);
    }

    // Implementer-specific method
    @Override
    void drawShape(int border) {
        System.out.println("This triangle is colored with ");
        color.fillWithColor(border);
    }

    // Abstraction-specific method
    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length " + increment + " times");
        border *= increment;
        drawShape(border);
    }


}