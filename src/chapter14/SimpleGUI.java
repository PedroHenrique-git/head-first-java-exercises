package chapter14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class YellowSquare extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(50, 50, 100, 100);
    }
}

class Picture extends JPanel {
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("image.png").getImage();

        g.drawImage(image, 3, 4, this);
    }
}

class RandomPanel extends JPanel {
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

class GradientCircle extends JPanel {
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);

        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }
}

public class SimpleGUI implements ActionListener {
    private JButton button;

    public void go() {
        JFrame frame = new JFrame();

        JPanel pane = new JPanel();

        pane.setSize(300, 300);

        JPanel square = new YellowSquare();
        JPanel picture = new Picture();
        JPanel randomPanel = new RandomPanel();
        JPanel gradientCircle = new GradientCircle();

        button = new JButton("click me");

        button.addActionListener(this);

        pane.add(button);
        pane.add(square);
        pane.add(picture);
        pane.add(randomPanel);
        pane.add(gradientCircle);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(pane);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked");
    }
}
