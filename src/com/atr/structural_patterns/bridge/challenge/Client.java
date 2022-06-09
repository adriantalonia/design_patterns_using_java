package com.atr.structural_patterns.bridge.challenge;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Bridge Pattern***");

        // Coloring Green to triangle
        System.out.println("\nColoring triangle");
        Color green = new GreenColor();
        Shape triangleShape = new Triangle(green);
        triangleShape.drawShape(20);
        triangleShape.modifyBorder(20, 3);


        // Coloring Green to triangle
        System.out.println("\nColoring triangle");
        Color red = new GreenColor();
        Shape rectangleShape = new Rectangle(red);
        rectangleShape.drawShape(50);
        rectangleShape.modifyBorder(50, 2);

    }
}
