package com.atr.behavior_patterns.visitor.challenge;

import java.util.ArrayList;

public class Client {

    private static ArrayList<Element> items = new ArrayList<>();

    public static double calculatePostage(Visitor visitor) {
        for (Element element : items) {
            element.accept(visitor);
        }
        return visitor.getTotalPostageForCart();
    }

    public static void main(String[] args) {

        Element myBook = new Book(8.52, 1.05);
        Element myCD = new CD(18.52, 3.05);
        Element myDVD = new DVD(6.53, 4.02);

        items.add(myBook);
        items.add(myCD);
        items.add(myDVD);

        Visitor visitor = new USPostageVisitor();
        double myPostage = calculatePostage(visitor);
        System.out.println("The total postage for my items is: "+myPostage);

        visitor = new SouthAmericaPostageVisitor();
        myPostage = calculatePostage(visitor);
        System.out.println("The total postage for my items is: "+myPostage);
    }
}
