package com.atr.creational_patterns.abstract_factory;

public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}

class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }

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

class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String colorType) {
        if(colorType == null) {
            return null;
        }
        switch (colorType) {
            case "RED":
                return new Red();
            case "GREEN":
                return new Green();
            case "BLUE":
                return new Blue();
            default:
                throw new IllegalArgumentException("Unknown colorType " + colorType);
        }
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}