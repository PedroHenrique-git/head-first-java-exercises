package chapter13;

import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public void play() {
        try(Sequencer player = MidiSystem.getSequencer();) {
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            ShortMessage msg1 = new ShortMessage();
            msg1.setMessage(ShortMessage.NOTE_ON, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(msg1, 1);
            track.add(noteOn);

            ShortMessage msg2 = new ShortMessage();
            msg2.setMessage(ShortMessage.NOTE_OFF, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(msg2, 16);
            track.add(noteOff);

            player.setSequence(seq);

            player.open();
            player.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
