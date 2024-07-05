package chapter14;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SimpleGuiApp {
    private final JFrame window = new JFrame();
    private final JLabel label = new JLabel();
    private final JButton changeColorButton = new JButton();
    private final JButton changeLabelButton = new JButton();
    private final JPanel panel = new Circle();
    private int x = 0;
    private int y = 0;

    public void start() {
        configureButtons();
        configureWindow();
        configureLabel();
    }

    private void configureButtons() {
        changeColorButton.setText("Change colors");

        changeColorButton.addActionListener((_event) -> {
            panel.repaint();
        });

        changeLabelButton.setText("Change label");

        changeLabelButton.addActionListener((_event) -> {
            label.setText("Changed label");
        });
    }

    private void configureLabel() {
        label.setText("I'm a Label");
    }

    private void configureWindow() {
        window.getContentPane().add(BorderLayout.CENTER, panel);
        window.getContentPane().add(BorderLayout.SOUTH, changeColorButton);
        window.getContentPane().add(BorderLayout.EAST, changeLabelButton);
        window.getContentPane().add(BorderLayout.WEST, label);

        window.setSize(600, 300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static class Circle extends JPanel {
        public void paintComponent(Graphics g) {
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            Random random = new Random();
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);

            Color randomColor = new Color(red, green, blue);
            g.setColor(randomColor);
            g.fillOval(70, 70, 100, 100);
        }
    }
}
