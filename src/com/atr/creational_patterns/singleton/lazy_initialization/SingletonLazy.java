package com.atr.creational_patterns.singleton.lazy_initialization;

public class SingletonLazy {
    //private reference to the one and only instance
    private static SingletonLazy uniqueInstance = null;

    //an instance attribute
    private int data = 0;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonLazy();
        }

        return uniqueInstance;
    }

    public void setDate(int myData){
        data = myData;
    }

    public int getData() {
        return data;
    }

}
