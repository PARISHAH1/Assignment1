package DesignPatterns.structural.adapter;

import java.util.logging.Logger;

public class LegacyAudioPlayer {
    private static final Logger LOG = Logger.getLogger(LegacyAudioPlayer.class.getName());

    public void playFile(final String file) {
        if (file == null || file.isBlank()) {
            throw new IllegalArgumentException("filename must not be null/blank");
        }
        LOG.info(() -> "Playing audio file: " + file);
        System.out.println("Playing audio file: " + file);
    }
}
