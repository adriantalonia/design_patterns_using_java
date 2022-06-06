package com.atr.structural_patterns.adapter.example02;

public class Rectangle {
    public double length;
    public double width;
}

class Triangle {
    public double base;
    public double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
}
