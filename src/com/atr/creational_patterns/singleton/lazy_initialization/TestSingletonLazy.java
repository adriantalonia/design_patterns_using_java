package com.atr.creational_patterns.singleton.lazy_initialization;

public class TestSingletonLazy {

    public static void main(String[] args) {

        SingletonLazy s = SingletonLazy.getInstance();

        // set the data value
        s.setDate(55);
        System.out.println("First Reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());

        // Get another reference to the singleton
        // is it the same object?
        s = null;
        s = SingletonLazy.getInstance();

        System.out.println("First Reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());
    }
}
