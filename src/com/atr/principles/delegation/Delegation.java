package com.atr.principles.delegation;

/**
 * Several Design Patterns use Delegation
 * <p>
 * 1) State: an object delegates request to a State object that represents its current states
 * 2) Strategy: an object delegates a specific request to an object that represents a strategy for carrying out the request
 * 3) Visitor: the operation that gets performed on each element of an object structure is always delegated to the visitor object
 */

class RealPrinter {
    // the delegate
    void print() {
        System.out.println("the delegate RealPrinter");
    }
}

class Printer {
    // the delegator
    RealPrinter p = new RealPrinter(); //composition

    //create the delegate
    void print() {
        p.print();
    }
}

public class Delegation {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();
    }
}