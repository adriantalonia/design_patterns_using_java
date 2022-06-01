package com.atr.creational_patterns.builder.challenge;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items;

    public Meal() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        items.forEach(i -> {
            System.out.println("Item: " + i.name());
            System.out.println("Packing: " + i.packing().pack());
            System.out.println("Price : " + i.price());
        });
    }


}
