// Demo
public class AdapterDemo {
    public static void main(final String[] args) {
        final LegacyAudioPlayer legacyPlayer = new LegacyAudioPlayer();
        final MediaPlayer player = new AudioPlayerAdapter(legacyPlayer);

        player.play("song.mp3");
    }
}
