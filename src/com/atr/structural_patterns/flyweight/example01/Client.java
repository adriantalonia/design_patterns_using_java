package com.atr.structural_patterns.flyweight.example01;

import java.util.Random;

public class Client {
    public static void main(String[] args) throws Exception {
        RobotFactory myFactory = new RobotFactory();

        System.out.println("\n***Flyweight Pattern Example***");

        /*RobotI robot = myFactory.getRobotFromFactory("small");
        robot.print();

        for (int i = 0; i < 2; i++) {
            robot = myFactory.getRobotFromFactory("small");
            robot.print();
        }
        int numOfDistinctRobots = myFactory.totalObjectsCreate();
        System.out.println("\nDistinct Robot objects created till now = " + numOfDistinctRobots);

        for (int i = 0; i < 2; i++) {
            robot = myFactory.getRobotFromFactory("large");
            robot.print();
        }

        numOfDistinctRobots = myFactory.totalObjectsCreate();
        System.out.println("\nFinally no of distinct Robot objects created  = " + numOfDistinctRobots);*/

        Robot robot = null;
        for (int i = 0; i < 3; i++) {
            robot = (Robot) myFactory.getRobotFromFactory("King");
            robot.setColor(getRandomColor());
            robot.print();
        }

        for (int i = 0; i < 3; i++) {
            robot = (Robot) myFactory.getRobotFromFactory("Queen");
            robot.setColor(getRandomColor());
            robot.print();
        }

        int numOfDistinctRobots = myFactory.totalObjectsCreate();
        System.out.println("\nFinally no of distinct Robot objects created = " + numOfDistinctRobots);
    }

    public static String getRandomColor() {
        Random r = new Random();
        int random = r.nextInt(20);
        if (random % 2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }
}
