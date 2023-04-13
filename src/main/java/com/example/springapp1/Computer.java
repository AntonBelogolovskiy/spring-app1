package com.example.springapp1;

import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id=1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return String.format("Computer %d %s",id,musicPlayer.playMusic());
    }
}
