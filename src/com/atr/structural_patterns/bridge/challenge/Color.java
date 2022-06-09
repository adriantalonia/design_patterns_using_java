package com.atr.structural_patterns.bridge.challenge;

public interface Color {
    void fillWithColor(int border);
}

class RedColor implements Color {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Red color with "+border+ " inch border");
    }
}

class GreenColor implements Color {

    @Override
    public void fillWithColor(int border) {
        System.out.println("Green color with "+border+ " inch border");
    }
}