package com.zsbc.zsbcutils;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Sound {

    private File file;
    private AudioInputStream audioInputStream;
    private Clip clip;

    public Sound(String soundPath) {
        this.file = new File(soundPath);
        try {
            this.audioInputStream = AudioSystem.getAudioInputStream(file);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            this.clip = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        try {
            clip.open(audioInputStream);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        clip.start();
    }

    public void stop() {
        clip.stop();
    }

    public void restart() {
        clip.setMicrosecondPosition(0);
    }

    public boolean isRunning() {
        return clip.isRunning();
    }
}
