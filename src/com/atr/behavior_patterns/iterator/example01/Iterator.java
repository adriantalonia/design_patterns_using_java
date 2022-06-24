package com.atr.behavior_patterns.iterator.example01;

interface Iterator {
    // Inficates wheter there are more elements to iterator over
    boolean hasNext();

    // returns the next element
    Object next();
}
