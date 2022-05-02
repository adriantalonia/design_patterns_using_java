package com.atr.principles.open_closed;

/**
 * - classes and methods should be open for extension (new functionality) and closed for modification
 * - a class should be easily extendable without modifying the class itself
 */


interface Shape {
    public double calculateArea();
}

class Rectangle implements Shape {
    public double length;
    public double width;

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    public double radius;

    @Override
    public double calculateArea() {
        return (22 / 7) * radius * radius;
    }
}

/*class AreaCalculator {
    public double calculateRectangleArea(Rectangle rec) {
        return rec.length * rec.width;
    }

    public double CalculateCircleArea(Circle cir) {
        return (22/7) * cir.radius * cir.radius;
    }
}*/

//delegation
class AreaCalculator {
    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }
}

public class OpenClosed {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 10;
        rectangle.width = 20;
        AreaCalculator calculator = new AreaCalculator();
        System.out.println(calculator.calculateShapeArea(rectangle));
    }
}
