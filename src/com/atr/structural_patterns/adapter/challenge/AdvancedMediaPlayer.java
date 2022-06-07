package com.atr.structural_patterns.adapter.challenge;

public interface AdvancedMediaPlayer {
    public void loadFilename(String fileName);

    public void listen();
}

class VlcPlayer implements AdvancedMediaPlayer {

    String fileName;

    @Override
    public void loadFilename(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing vcl file. Name: " + fileName);
    }
}

class Mp4Player implements AdvancedMediaPlayer {

    String fileName;

    @Override
    public void loadFilename(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}