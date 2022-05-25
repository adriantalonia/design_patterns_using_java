package com.atr.creational_patterns.singleton.double_checked_locking;

public class SingletonDoubleChecked {

    // volatile keyword ensures that multiple threads handle the unique instance variable correctly
    private volatile static SingletonDoubleChecked uniqueInstance = null;

    private SingletonDoubleChecked() {}

    public static SingletonDoubleChecked getInstance() {
        if(uniqueInstance == null) {
            // only synchronize the first time through
            synchronized (SingletonDoubleChecked.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleChecked();
                }
            }
        }
        return uniqueInstance;
    }
}
