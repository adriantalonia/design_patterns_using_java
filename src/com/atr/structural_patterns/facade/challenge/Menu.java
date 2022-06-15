package com.atr.structural_patterns.facade.challenge;

interface Menus {
    void showMenu();
}

class NonVegMenu implements Menus {

    public NonVegMenu() {
        System.out.println("Creating a non veg menu");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu items in non veg menu");
    }
}

class VegMenu implements Menus {

    public VegMenu() {
        System.out.println("Creating a veg menu");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu items in veg menu");
    }
}

class Both implements Menus {

    public Both() {
        System.out.println("Creating a both menu");
    }

    @Override
    public void showMenu() {
        System.out.println("Menu items in both menu");
    }
}