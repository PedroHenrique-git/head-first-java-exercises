package chapter14;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class SimpleAnimationGui {
    private final JFrame window = new JFrame();
    private int x = 70;
    private int y = 70;

    public void go() {
        JPanel drawPanel = new MyDrawPanel();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setSize(1280, 720);
        window.setVisible(true);

        window.getContentPane().add(drawPanel);

        for(int i = 0; i < 130; i++) {
            x += 1;
            y += 1;

            drawPanel.repaint();

            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            g.setColor(Color.orange);
            g.fillOval(x, y, 40, 40);
        }
    }
}
