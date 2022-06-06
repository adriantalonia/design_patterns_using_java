package com.atr.structural_patterns.adapter.example02;

public class CalculatorAdapter implements CalculatorInterface {

    Calculator calculator;
    Triangle t;

    public CalculatorAdapter (Triangle triangle) {
        t = triangle;
    }

    @Override
    public double getArea(Rectangle r) {
        calculator = new Calculator();
        Rectangle rectangle = new Rectangle();

        rectangle.length = t.base;
        rectangle.width = 0.5 * t.height;

        return calculator.getArea(rectangle);
    }
}
