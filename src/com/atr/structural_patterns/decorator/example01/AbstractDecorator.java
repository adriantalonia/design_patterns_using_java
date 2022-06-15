package com.atr.structural_patterns.decorator.example01;

abstract class AbstractDecorator extends Component {
    protected Component com;
    public void setComponent(Component c){
        com = c;
    }

    public void doJob() {
        if (com != null) {
            com.doJob();
        }
    }
}

class ConcreteDecoratorEx_1 extends AbstractDecorator {
    @Override
    public void doJob() {
        super.doJob();

        // add additional responsibilities
        System.out.println("I'm explicitly from EX_1");
    }
}

class ConcreteDecoratorEx_2 extends AbstractDecorator {
    @Override
    public void doJob() {
        System.out.println("");
        System.out.println("***START EX-2**");

        super.doJob();

        // add additional responsibilities
        System.out.println("Explicitly from EX_1");
        System.out.println("***END. EX-2***");
    }
}
