package DesignPatterns.structural.adapter;

import java.util.Objects;

public class AudioPlayerAdapter implements MediaPlayer {
    private final LegacyAudioPlayer legacyPlayer;

    public AudioPlayerAdapter(final LegacyAudioPlayer player) {
        this.legacyPlayer = Objects.requireNonNull(player, "LegacyAudioPlayer must not be null");
    }

    @Override
    public void play(final String filename) {
        legacyPlayer.playFile(filename);
    }
}
