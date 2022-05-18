package com.atr.creational_patterns.abstract_factory;

public class Client {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color red = colorFactory.getColor("RED");
        red.fill();

    }
}
