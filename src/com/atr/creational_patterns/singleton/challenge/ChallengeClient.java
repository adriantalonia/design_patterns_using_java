package com.atr.creational_patterns.singleton.challenge;

public class ChallengeClient {
    public static void main(String[] args) {

        System.out.println("***Singleton Pattern Demo***");
        System.out.println();
        System.out.println("Trying to make a captain for our team");
        ChallengeSingleton c1 = ChallengeSingleton.getInstance();
        if (c1 != null)
            System.out.println("You already have a Captain for your team. Send him for the toss.");

        ChallengeSingleton c2 = ChallengeSingleton.getInstance();
        if (c1 == c2)
            System.out.println("c1 and c2 are same instance");
    }
}
