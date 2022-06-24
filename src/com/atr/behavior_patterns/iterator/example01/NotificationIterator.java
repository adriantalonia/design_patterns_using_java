package com.atr.behavior_patterns.iterator.example01;

public class NotificationIterator implements Iterator {

    Notification[] notificationsLit;

    int pos = 0;

    public NotificationIterator(Notification[] notificationsLit) {
        this.notificationsLit = notificationsLit;
    }

    @Override
    public boolean hasNext() {
        if (pos >= notificationsLit.length || notificationsLit[pos] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Notification notification = notificationsLit[pos];
        pos += 1;
        return notification;
    }
}
