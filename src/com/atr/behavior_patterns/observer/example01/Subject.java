package com.atr.behavior_patterns.observer.example01;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    // methods to register and unregister observers
    void register(Observer obj);

    void unregister(Observer obj);

    // method to notify observers og changes
    void notifyObservers();

    // method to get updates from Subject, not required but added so observes can query
    Object getUpdate(Observer obj);
}

class MyTopic implements Subject {
    private List<Observer> observers;
    private String message;
    private boolean changed;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null observer");
        if (!observers.contains(obj)) observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;

        if (!changed) return;

        observersLocal = new ArrayList<>(this.observers);
        this.changed = false;

        for (Observer obj : observersLocal) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("Message posted to topic: " + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}