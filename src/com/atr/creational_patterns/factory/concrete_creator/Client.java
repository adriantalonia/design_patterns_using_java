package com.atr.creational_patterns.factory.concrete_creator;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method
        ShapeConcrete circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        ShapeConcrete rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        ShapeConcrete square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
