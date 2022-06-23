package com.atr.behavior_patterns.interpreter.challenge;

public class Client {

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarrieWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarrieWomanExpression();

        Context ic = new Context("John");
        System.out.println("John is male? " + isMale.interpreter(ic));

        Context ic2 = new Context("Married Julie");
        System.out.println("Julie is a married women? " + isMarriedWoman.interpreter(ic2));

        Context ic3 = new Context("Lucy");
        System.out.println("Lucy is male? " + isMale.interpreter(ic3));
    }
}
