package com.atr.structural_patterns.flyweight.challenge;

public interface Player {
    public void assignWeapon(String weapon);

    public void mission();
}

class Terrorist implements Player {
    // Intrinsic Attribute
    private final String TASK;

    // Extrinsic Attribute
    private String weapon;

    public Terrorist() {
        TASK = "PLANT A BOMB";
    }

    public void assignWeapon(String weapon) {
        // Assign a weapon
        this.weapon = weapon;
    }

    public void mission() {
        //Work on the Mission
        System.out.println("Terrorist with weapon "
                + weapon + "|" + " Task is " + TASK);
    }
}

class CounterTerrorist implements Player {
    // Intrinsic Attribute
    private final String TASK;

    // Extrinsic Attribute
    private String weapon;

    public CounterTerrorist() {
        TASK = "DIFFUSE BOMB";
    }

    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void mission() {
        System.out.println("Counter Terrorist with weapon "
                + weapon + "|" + " Task is " + TASK);
    }
}