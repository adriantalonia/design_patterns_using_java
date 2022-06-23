package com.atr.behavior_patterns.interpreter.challenge;

interface Expression {
    boolean interpreter(Context con);
}

class AndExpression implements Expression {
    Expression expr1;
    Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpreter(Context con) {
        return expr1.interpreter(con) && expr2.interpreter(con);
    }
}

class OrExpression implements Expression {
    Expression expr1;
    Expression expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public boolean interpreter(Context con) {
        return expr1.interpreter(con) || expr2.interpreter(con);
    }
}
