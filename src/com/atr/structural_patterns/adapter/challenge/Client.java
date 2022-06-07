package com.atr.structural_patterns.adapter.challenge;

public class Client {

    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "lastnite.mp3");

        AdvancedMediaPlayer mp4Player = new Mp4Player();
        MediaPlayer advancedMediaPlayerAdapter1 = new AdvancedMediaPlayerAdapter(mp4Player);
        advancedMediaPlayerAdapter1.play("mp4", "alone.mp4");

        AdvancedMediaPlayer vlcPlayer = new VlcPlayer();
        MediaPlayer advancedMediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advancedMediaPlayerAdapter2.play("vlc", "far far away.vlc");

        audioPlayer.play("vlc", "far far away.vlc");
    }
}
