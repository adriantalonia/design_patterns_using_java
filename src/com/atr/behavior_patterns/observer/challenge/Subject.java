package com.atr.behavior_patterns.observer.challenge;

import java.util.ArrayList;
import java.util.Iterator;

interface Subject {

    void registerObserver(Observer o);

    void unregisterObserver(Observer o);

    void notifyObserver();
}

class CricketData implements Subject {
    private int runs;
    private int wickets;
    private float overs;

    ArrayList<Observer> observerList;

    public CricketData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(observerList.indexOf(o));
    }

    @Override
    public void notifyObserver() {
        for (Iterator<Observer> it = observerList.iterator(); it.hasNext(); ) {
            Observer o = it.next();
            o.update(runs, wickets, overs);
        }
    }

    private int getLatesRuns() {
        return 90;
    }

    private int getLatesWickets() {
        return 2;
    }

    private float getLatesOvers() {
        return (float) 10.2;
    }

    public void dataChanged() {
        runs = getLatesRuns();
        wickets = getLatesWickets();
        overs = getLatesOvers();

        notifyObserver();
    }
}