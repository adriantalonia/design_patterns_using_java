package com.atr.structural_patterns.flyweight.example01;

import java.util.HashMap;
import java.util.Map;

class RobotFactory {
    Map<String, RobotI> robots = new HashMap<String, RobotI>();

    public int totalObjectsCreate() {
        return robots.size();
    }

    public RobotI getRobotFromFactory(String robotType) throws Exception {
        RobotI myRobot = null;

        if (robots.containsKey(robotType)) {
            myRobot = robots.get(robotType);
        } else {
            switch (robotType) {
                case "King":
                    System.out.println("We do not have King Robot, so we are creating a King Robot");
                    myRobot = new Robot("King");
                    robots.put("King", myRobot);
                    break;
                case "Queen":
                    System.out.println("We do not have Queen Robot, so we are creating a Queen Robot");
                    myRobot = new Robot("Queen");
                    robots.put("Queen", myRobot);
                    break;
                default:
                    throw new Exception("Robot factory can create only King and Queen robots");

            }
        }
        return myRobot;
    }

    /*public RobotI getRobotFromFactory(String robotCategory) throws Exception {
        RobotI myRobot = null;

        if (robots.containsKey(robotCategory)) {
            myRobot = robots.get(robotCategory);
        } else {
            switch (robotCategory) {
                case "small":
                    System.out.println("We do not have Small Robot, so we are creating a Small Robot");
                    myRobot = new SmallRobot();
                    robots.put("small", myRobot);
                    break;
                case "large":
                    System.out.println("We do not have Small Robot, so we are creating a Large Robot");
                    myRobot = new LargeRobot();
                    robots.put("large", myRobot);
                    break;
                default:
                    throw new Exception("Robot factory can create only small and large robots");

            }
        }
        return myRobot;
    }*/
}
