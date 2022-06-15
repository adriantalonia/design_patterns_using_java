package com.atr.structural_patterns.decorator.challenge;

abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }

    abstract void setBorder(Shape decoratedShape);
}

class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setBorder(decoratedShape);
    }

    @Override
    void setBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}

class GreenShapeDecorator extends ShapeDecorator {
    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        System.out.println("*** Green Decorator ***");
        super.draw();
        System.out.println("*** end Green Decorator ***");
    }

    @Override
    void setBorder(Shape decoratedShape) {
        System.out.println("Border Color: Green");
    }
}
