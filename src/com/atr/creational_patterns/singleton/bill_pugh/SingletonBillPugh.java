package com.atr.creational_patterns.singleton.bill_pugh;

public class SingletonBillPugh {

    private SingletonBillPugh() { }

    private static class SingletonHelper {
        // Nested class is referenced after getInstance() is called
        private static final SingletonBillPugh uniqueInstance = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingletonHelper.uniqueInstance;
    }
}
