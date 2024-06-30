package chapter13;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer");
        } catch (MidiUnavailableException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Runs no matter what");
        }
    }
}
