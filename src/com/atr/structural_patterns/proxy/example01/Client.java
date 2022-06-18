package com.atr.structural_patterns.proxy.example01;

public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("someFilename.jpg");
        image.display();
        System.out.println("");
        image.display();
    }
}
