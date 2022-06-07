package com.atr.structural_patterns.adapter.challenge;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer adv) {
        this.advancedMediaPlayer = adv;
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMediaPlayer.loadFilename(fileName);
        advancedMediaPlayer.listen();
    }
}
