package com.atr.structural_patterns.decorator.example01;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Decorator pattern Demo**");

        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecoratorEx_1 cd_1 = new ConcreteDecoratorEx_1();

        // Decorating ConcreteComponent Object cc with ConcreteDecoratorEx_1
        cd_1.setComponent(cc);
        cd_1.doJob(); //additional functionality

        ConcreteDecoratorEx_2 cd_2 = new ConcreteDecoratorEx_2();
        // Decorating ConcreteComponent Object cc with ConcreteDecoratorEx_1 && ConcreteDecoratorEX_2
        cd_2.setComponent(cd_1);
        cd_2.doJob();

    }
}
