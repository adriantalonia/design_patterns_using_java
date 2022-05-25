package com.atr.creational_patterns.singleton.synchronized_method;

public class SingletonSynchronized {

    //private reference to the one and only instance
    private static SingletonSynchronized uniqueInstance = null;

    //an instance attribute
    private int data = 0;

    private SingletonSynchronized() {}

    // by adding the synchronized keyword to getInstance()
    // we force every thread to wait its turn before it can enter the method
    public static synchronized SingletonSynchronized getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSynchronized();
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
