package com.atr.principles.interface_segregation;

/**
 * Clients should not be forced to depend upon  interfaces that they do not use
 * */

interface Shape {
    double area();
}

interface SolidShape {
    double volume();
}

interface ManageShape {
    double calculate();
}

class Cube implements Shape, SolidShape, ManageShape {
    @Override
    public double area() {
        return 1.1;
    }

    @Override
    public double volume() {
        return 1.0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();
    }
}

class Square implements Shape, ManageShape {
    @Override
    public double area() {
        return 2.0;
    }

    @Override
    public double calculate() {
        return this.area();
    }
}

public class InterfaceSegregation {
}
