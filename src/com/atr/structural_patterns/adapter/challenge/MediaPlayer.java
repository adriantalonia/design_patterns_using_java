package com.atr.structural_patterns.adapter.challenge;

public interface MediaPlayer {
    public void play(String audioType, String fileName);
}

class AudioPlayer implements MediaPlayer {


    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}