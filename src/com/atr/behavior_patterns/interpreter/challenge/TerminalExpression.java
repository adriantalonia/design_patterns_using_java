package com.atr.behavior_patterns.interpreter.challenge;

public class TerminalExpression implements Expression {
    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpreter(Context con) {
        return con.getResult(data);
    }
}