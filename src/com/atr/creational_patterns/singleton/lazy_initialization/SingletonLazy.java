package com.atr.creational_patterns.singleton.lazy_initialization;

public class SingletonLazy {
    //private reference to the one and only instance
    private static SingletonLazy unitInstance = null;

    //an instance attribute
    private int data = 0;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        if (unitInstance == null) {
            unitInstance = new SingletonLazy();
        }

        return unitInstance;
    }

    public void setDate(int myData){
        data = myData;
    }

    public int getData() {
        return data;
    }

}
