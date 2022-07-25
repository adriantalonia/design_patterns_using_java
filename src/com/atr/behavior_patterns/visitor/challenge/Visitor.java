package com.atr.behavior_patterns.visitor.challenge;

interface Visitor {
    void visit(Book book);

    void visit(CD cd);

    void visit(DVD dvd);

    public double getTotalPostageForCart();
}

class USPostageVisitor implements Visitor {

    private double totalPostageForCart = 0;

    @Override
    public void visit(Book book) {
        if (book.getPrice() < 20.0) {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        if (cd.getPrice() < 20.0) {
            totalPostageForCart += cd.getWeight() * 2.5;
        }
    }

    @Override
    public void visit(DVD dvd) {
        if (dvd.getPrice() < 20.0) {
            totalPostageForCart += dvd.getWeight() * 3;
        }
    }

    public double getTotalPostageForCart() {
        return totalPostageForCart;
    }
}

class SouthAmericaPostageVisitor implements Visitor {

    private double totalPostageForCart = 0;

    @Override
    public void visit(Book book) {
        if (book.getPrice() < 20.0) {
            totalPostageForCart += (book.getWeight() * 2) * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        if (cd.getPrice() < 20.0) {
            totalPostageForCart += (cd.getWeight() * 2.5) * 2;
        }
    }

    @Override
    public void visit(DVD dvd) {
        if (dvd.getPrice() < 20.0) {
            totalPostageForCart += (dvd.getWeight() * 3) * 2;
        }
    }

    public double getTotalPostageForCart() {
        return totalPostageForCart;
    }
}
