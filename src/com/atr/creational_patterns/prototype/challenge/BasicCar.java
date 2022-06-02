package com.atr.creational_patterns.prototype.challenge;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
    protected String model;
    protected int price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public static int setPrice() {
        return new Random().nextInt(100000);
    }

    public BasicCar clone() {
        BasicCar clone = null;
        try {
            clone = (BasicCar) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
