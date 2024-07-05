package chapter14;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MiniMusicPlayer {
    private JPanel panel = null;
    private final Random random = new Random();

    public void setupGui() {
        JFrame frame = new JFrame("My first Music Video");
        panel = new MyDrawPanel();
        frame.setContentPane(panel);
        frame.setBounds(30, 30, 300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void go() {
        setupGui();

        try(Sequencer sequencer = MidiSystem.getSequencer()) {
            sequencer.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            int[] eventsIWant = {127};

            sequencer.addControllerEventListener((ControllerEventListener) panel, eventsIWant);

            for (int i = 5; i < 61; i += 4) {
                track.add(makeEvent(ShortMessage.NOTE_ON, 1, i, 100, i));

                track.add(makeEvent(ShortMessage.CONTROL_CHANGE, 1, 127, 0, i));

                track.add(makeEvent(ShortMessage.NOTE_OFF, 1, i, 100, i + 2));
            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();

            while(sequencer.isRunning());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MidiEvent makeEvent(int command, int channel, int one, int two, int tick) {
        MidiEvent event = null;

        try {
            ShortMessage msg = new ShortMessage();
            msg.setMessage(command, channel, one, two);
            event = new MidiEvent(msg, tick);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }

        return event;
    }

    class MyDrawPanel extends JPanel implements ControllerEventListener {
        private boolean msg = false;

        public void controlChange(ShortMessage event) {
            msg = true;
            repaint();
        }

        public void paintComponent(Graphics g) {
            if(msg) {
                int r = random.nextInt(250);
                int gr = random.nextInt(250);
                int b = random.nextInt(250);

                g.setColor(new Color(r, gr, b));

                int height = random.nextInt(120) + 10;
                int width = random.nextInt(120) + 10;

                int xPos = random.nextInt(40) + 10;
                int yPos = random.nextInt(40) + 10;

                g.fillRect(xPos, yPos, width, height);
                msg = false;
            }
        }
    }
}
