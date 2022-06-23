package com.atr.behavior_patterns.interpreter.challenge;

public class Context {

    String input;

    public Context(String input) {
        this.input = input;
    }

    public boolean getResult(String data) {
        if(input.contains(data)){
            return true;
        } else {
            return false;
        }

    }
}
