package com.atr.behavior_patterns.mediator.challenge;

import java.util.ArrayList;
import java.util.List;

interface Mediator {
    void addBuyers(Buyer buyer);

    void findHigestBigger();
}

class AuctionMediator implements Mediator {
    private List<Buyer> buyers;

    public AuctionMediator() {
        buyers = new ArrayList<>();
    }

    @Override
    public void addBuyers(Buyer buyer) {
        this.buyers.add(buyer);
        System.out.println(buyer.name + " was added to the buyers list.");
    }

    @Override
    public void findHigestBigger() {
        int maxBid = 0;
        Buyer winner = null;
        for (Buyer b : this.buyers) {
            if (b.price > maxBid) {
                maxBid = b.price;
                winner = b;
            }
            b.auctionHasEnded();
        }
        System.out.println("The auction winner is: " + winner.name + ". He paid $" + winner.price + " for the item");

        for (Buyer b : this.buyers) {
            b.auctionHasEnded();
        }
    }
}