package com.atr.creational_patterns.builder;

public class Client {

    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***\n");

        Director director = new Director();
        BuilderInterface carBuilder = new Car();
        BuilderInterface motorcycleBuilder = new Motorcycle();

        director.construct(carBuilder);
        director.constructProduct();
        Product car = director.getProduct();
        car.show();

        director.construct(motorcycleBuilder);
        director.constructProduct();
        Product motorcycle = director.getProduct();
        motorcycle.show();
    }
}
