package com.atr.creational_patterns.builder;

import java.util.LinkedList;

public class Product {
    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<String>();
    }

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("Product completed as below");

        parts.forEach(p -> {
            System.out.println(p);
        });
    }

}
