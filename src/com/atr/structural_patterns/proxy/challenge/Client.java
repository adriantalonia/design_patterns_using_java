package com.atr.structural_patterns.proxy.challenge;

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("jason.org");
            internet.connectTo("whatever.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
