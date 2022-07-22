package com.atr.behavior_patterns.strategy.example01;

public class Client {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PaypalStrategy("test@mail.com", "password"));

        cart.pay(new CreditCardStrategy("Adrian", "123-345-567-123", "345", "12-05-2050"));
    }
}
