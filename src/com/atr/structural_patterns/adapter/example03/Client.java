package com.atr.structural_patterns.adapter.example03;

public class Client {

    public static void main(String[] args) {
        // class Adapter
        System.out.println("***Class Adapter Demo***");
        ClassAdapter ca1 = new ClassAdapter();
        System.out.println("Class Adapter is returning: " + ca1.getInteger());

        // Object adapter
        System.out.println("***Object Adapter Demo***");
        ObjectAdapter objectAdapter = new ObjectAdapter(new IntegerValue());
        System.out.println("Object Adapter is returning: " + objectAdapter.getInteger());

    }
}
