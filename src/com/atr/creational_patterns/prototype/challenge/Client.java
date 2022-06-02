package com.atr.creational_patterns.prototype.challenge;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        BasicCarCache.loadCache();

        BasicCar bc1 = (BasicCar) BasicCarCache.getCar("Green Nano");
        bc1.price = bc1.price + BasicCar.setPrice();
        System.out.println("Car is: " + bc1.getModel() + " and it's price is: " + bc1.price);

        BasicCar bc2 = (BasicCar) BasicCarCache.getCar("Ford Focus");
        bc2.price = bc2.price + BasicCar.setPrice();
        System.out.println("Car is: " + bc2.getModel() + " and it's price is: " + bc2.price);
    }
}
