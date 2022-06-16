package com.atr.structural_patterns.flyweight.example01;

interface RobotI {
    void print();
    void setColor(String color);
}

class Robot implements RobotI {
    String type;
    public String color;

    public Robot(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("This is a "+type+" type robot with "+color+" color");
    }
}


/*
class SmallRobot implements RobotI {
    @Override
    public void print() {
        System.out.println("THis is a small robot");
    }
}

class LargeRobot implements RobotI {
    @Override
    public void print() {
        System.out.println("This is a large robot");
    }
}*/
