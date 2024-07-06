package chapter15;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyEvent;

public class SimpleGuiOne {
    public void go() {
        JFrame window = new JFrame("Simple gui one");
        JPanel panel = new JPanel();
        Font bigFont = new Font("serif", Font.BOLD, 16);
        JTextField field = new JTextField("Your name", 20);
        JTextArea text = new JTextArea(10, 20);
        JButton button = new JButton("Just click");
        JScrollPane scroller = new JScrollPane(text);
        JCheckBox checkBox = new JCheckBox("check");
        JList<String> list = new JList<>(new String[]{"alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta", "alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta"});
        JScrollPane scrollerTwo = new JScrollPane(list);

        text.setLineWrap(true);

        scrollerTwo.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollerTwo.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        //JButton button = new JButton("shock me");
        //JButton buttonTwo = new JButton("bliss");

        //button.setFont(bigFont);

        //button.addActionListener((_event) -> {
            //System.out.println("clicked");
        //});

        //panel.setLayout(
                //new BoxLayout(panel, BoxLayout.Y_AXIS)
        //);

        //field.addKeyListener();

        //field.addActionListener((_event) -> {
            //System.out.println("text");
        //});

        checkBox.addActionListener((_event) -> {
            System.out.println(checkBox.isSelected());
        });

        panel.setBorder(
                new EmptyBorder(10, 10, 10, 10)
        );

        button.addActionListener((_event) -> {
            text.append("button clicked\n");
            System.out.println(text.getText());
        });

        panel.add(scroller);
        panel.add(scrollerTwo);
        panel.add(button);
        panel.add(checkBox);

        //panel.setBackground(Color.darkGray);
        //panel.add(field);
        //panel.add(button);
        //panel.add(buttonTwo);

        window.setVisible(true);
        window.setSize(700, 700);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.getContentPane().add(BorderLayout.CENTER, panel);
    }

    class KeyListener implements java.awt.event.KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
