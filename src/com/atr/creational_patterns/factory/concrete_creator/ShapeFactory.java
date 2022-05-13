package com.atr.creational_patterns.factory.concrete_creator;

public class ShapeFactory {

    // use getShape method to get object of type shape
    public ShapeConcrete getShape(String shapeType) {
        if (shapeType == null || shapeType.isEmpty())
            return null;

        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                throw new IllegalArgumentException("Unknown shapeType " + shapeType);
        }
    }

}
