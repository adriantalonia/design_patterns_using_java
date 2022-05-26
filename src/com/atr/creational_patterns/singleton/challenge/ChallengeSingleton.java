package com.atr.creational_patterns.singleton.challenge;

public class ChallengeSingleton {

    private ChallengeSingleton() {
    }

    private static class ChallengeHelper {
        private static final ChallengeSingleton unique = new ChallengeSingleton();
    }

    public static ChallengeSingleton getInstance() {
        return ChallengeHelper.unique;
    }
}
