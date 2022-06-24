package com.atr.behavior_patterns.iterator.challenge;

public class Client {

    public static void print(Iterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        System.out.println("***Iterator Pattern Demo***\n");
        Subject sc_subject = new Science();
        Subject ar_subject = new Arts();

        Iterator sc_iterator = sc_subject.createIterator();
        Iterator ar_iterator = ar_subject.createIterator();

        System.out.println("\nScience subjects: ");
        print(sc_iterator);
        System.out.println("\nArts subjects: ");
        print(ar_iterator);
    }
}
