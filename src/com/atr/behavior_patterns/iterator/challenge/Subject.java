package com.atr.behavior_patterns.iterator.challenge;

import java.util.LinkedList;

interface Subject {
    Iterator createIterator();
}

class Arts implements Subject {
    private String[] subjects;

    public Arts() {
        subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English";
    }

    @Override
    public Iterator createIterator() {
        return new ArtIterator(subjects);
    }
}

class Science implements Subject {
    private LinkedList<String> subjects;

    public Science() {
        subjects = new LinkedList<String>();
        subjects.addLast("Maths");
        subjects.addLast("Comp. Sc.");
        subjects.addLast("Physics");

    }

    @Override
    public Iterator createIterator() {
        return new ScienceIterator(subjects);
    }
}