package com.atr.creational_patterns.singleton.eager_initialization;

public class SingletonEagerInitialization {

    // create an instance of singleton in a static initializer, code is guaranteed to be thread safe
    private static SingletonEagerInitialization uniqueInstance = new SingletonEagerInitialization();

    private SingletonEagerInitialization() {}

    public static SingletonEagerInitialization getInstance() {
        return uniqueInstance;
    }
}
