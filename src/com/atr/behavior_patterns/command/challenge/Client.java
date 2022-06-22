package com.atr.behavior_patterns.command.challenge;

public class Client {
    public static void main(String[] args) {
        Stock googleStock = new Stock();

        Order buyStockOrder = new BuyStock(googleStock);
        Order sellStockOrder = new SellStock(googleStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
