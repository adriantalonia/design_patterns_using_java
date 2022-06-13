package com.atr.structural_patterns.composite.challenge;

public interface Faculty {
    String getDetails();
}

class Professor implements Faculty {
    private String name;
    private String position;
    private int number;

    public Professor(String name, String position, int number) {
        this.name = name;
        this.position = position;
        this.number = number;
    }

    @Override
    public String getDetails() {
        return (name + " is the" + position);
    }
}
