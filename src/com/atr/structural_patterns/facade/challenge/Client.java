package com.atr.structural_patterns.facade.challenge;

public class Client {
    public static void main(String[] args) {
        HotelKeeper keeper = new HotelKeeper();

        VegMenu v = keeper.getVegMenu();
        NonVegMenu nv = keeper.getNonVegMenu();
        Both bo = keeper.getVegNonMenu();
    }
}
