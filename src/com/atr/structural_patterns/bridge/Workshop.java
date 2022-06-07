package com.atr.structural_patterns.bridge;

public interface Workshop {
    abstract public void work();
}
class Produce implements Workshop {

    @Override
    public void work() {
        System.out.println("Produced");
    }
}

class Assemble implements Workshop {
    @Override
    public void work() {
        System.out.println("and Assemble");
    }
}