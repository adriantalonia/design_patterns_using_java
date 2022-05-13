package com.atr.creational_patterns.factory.static_creator;

public class Client {
    public static void main(String[] args) {

        ShapeStatic circle = ShapeStaticFactory.getShape("CIRCLE");
        circle.draw();

        ShapeStatic rectangle = ShapeStaticFactory.getShape("RECTANGLE");
        rectangle.draw();

        ShapeStatic square = ShapeStaticFactory.getShape("SQUARE");
        square.draw();
    }
}
