package com.atr.principles.liskov_substitution;

import java.util.Arrays;
import java.util.List;

/**
 * the principle defines that object of a superclass can be replaceable with object of its subclasses without breaking the application
 */

abstract class Vehicle {
    abstract int getSpeed();

    abstract int getCubicCapacity();
}

class Car extends Vehicle {
    @Override
    int getSpeed() {
        return 250;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }

    boolean sHatchBack() {
        return false;
    }
}

class Bus extends Vehicle {
    @Override
    int getSpeed() {
        return 200;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }
}

public class LiskovSubstitution {

    public static void main(String[] args) {
        Vehicle v1 = new Bus();
        Vehicle v2 = new Car();
        /*v1.getSpeed();
        v1 = new Car();
        v1.getCubicCapacity();*/

        var list = Arrays.asList(v1, v2);
        printListSpeed(list);
    }

    static void printListSpeed(List<Vehicle> vehicles) {
        vehicles.forEach(v -> {
            System.out.println(v.getSpeed());
        });
    }
}
