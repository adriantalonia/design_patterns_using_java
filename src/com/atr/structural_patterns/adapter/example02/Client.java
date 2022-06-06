package com.atr.structural_patterns.adapter.example02;

public class Client {

    public static void main(String[] args) {
        System.out.println("****Adapter Pattern Demo***");

        Triangle t = new Triangle(20, 10);

        CalculatorInterface calculatorAdapter = new CalculatorAdapter(t);

        System.out.println("Area of triangle is: "+ calculatorAdapter.getArea(null));

    }
}
