package com.atr.behavior_patterns.template_method.example01;

public class Client {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();

        houseType.buildHouse();

        System.out.println("**************");

        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
