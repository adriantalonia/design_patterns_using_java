package com.atr.behavior_patterns.mediator.challenge;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new AuctionMediator();

        Buyer b1 = new ActionBuyer(mediator, "Adrian");
        Buyer b2 = new ActionBuyer(mediator, "Eduardo");
        Buyer b3 = new ActionBuyer(mediator, "Oscar");

        mediator.addBuyers(b1);
        mediator.addBuyers(b2);
        mediator.addBuyers(b3);

        System.out.println("Welcome to the auction tonight");
        System.out.println("------------------------------");
        System.out.println("Waiting for the buyer's offers");

        b1.bid(1800);
        b2.bid(2000);
        b3.bid(780);
        System.out.println("------------------------------");
        mediator.findHigestBigger();

        b2.cancelTheBid();
        System.out.println(b2.name + " has canceled his bid, in that case ");

        mediator.findHigestBigger();
    }
}
