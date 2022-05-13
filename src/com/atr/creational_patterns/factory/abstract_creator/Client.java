package com.atr.creational_patterns.factory.abstract_creator;

public class Client {

    public static void main(String[] args) {

        //get an object of Circle and call its draw method
        Shape circle = new CircleFactory().getShape();
        circle.draw();

        Shape rectangle = new RectangleFactory().getShape();
        rectangle.draw();

        Shape square = new SquareFactory().getShape();
        square.draw();
    }
}
