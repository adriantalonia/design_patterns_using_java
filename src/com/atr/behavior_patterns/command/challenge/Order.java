package com.atr.behavior_patterns.command.challenge;

interface Order {
    void execute();
}

class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock){
        this.stock = stock;
    }

    public void execute() {
        stock.buy();
    }
}

class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock){
        this.stock = stock;
    }

    public void execute() {
        stock.sell();
    }
}