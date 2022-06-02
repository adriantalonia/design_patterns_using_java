package com.atr.creational_patterns.prototype.challenge;

import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<String, BasicCar> carMap = new Hashtable<String, BasicCar>();

    public static BasicCar getCar(String model) {
        BasicCar cachedCar = carMap.get(model);
        return (BasicCar) cachedCar.clone();
    }

    public static void loadCache() {
        BasicCar nano_base = new Nano("Green Nano");
        nano_base.price = 10000;
        carMap.put(nano_base.getModel(), nano_base);

        BasicCar ford_base = new Nano("Ford Focus");
        ford_base.price = 500000;
        carMap.put(ford_base.getModel(), ford_base);
    }

}
