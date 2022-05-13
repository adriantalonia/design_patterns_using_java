package com.atr.creational_patterns.factory.static_creator;

public class ShapeStaticFactory {

    public static ShapeStatic getShape(String shapeType) {
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
