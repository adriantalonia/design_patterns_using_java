package com.atr.behavior_patterns.iterator.example01;

public class Client {

    public static void main(String[] args) {
        NotificationCollection nc = new NotificationCollection();

        NotificationBar nb = new NotificationBar(nc);

        nb.printNotifications();
    }
}
