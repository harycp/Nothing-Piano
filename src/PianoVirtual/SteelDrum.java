
package PianoVirtual;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

// Kelas Anak Steel Drum yang mewarisi Instrument
class SteelDrum extends Instrument {
    // Konstruktor
    public SteelDrum(String path) {
        super(path);
    }

    // Implementasi metode play untuk Steel Drum
    @Override
    public void play() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.println("There is an ERROR:" + e);
        }
    }
}
