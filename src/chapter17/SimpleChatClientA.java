package chapter17;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class SimpleChatClientA {
    private JTextField outgoing;
    private PrintWriter writer;

    public static void main(String[] args) throws IOException {
        new SimpleChatClientA().go();
    }

    public void go() throws IOException {
        setUpNetworking();

        outgoing = new JTextField(20);

        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(e -> sendMessage());

        JPanel mainPanel = new JPanel();
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);

        JFrame frame = new JFrame("Ludicrously Simple Chat Client");

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(400, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void setUpNetworking() throws IOException {
        InetSocketAddress serverAddress = new InetSocketAddress("localhost", 5000);
        SocketChannel socketChannel = SocketChannel.open(serverAddress);
        writer = new PrintWriter(Channels.newWriter(socketChannel, StandardCharsets.UTF_8));

        System.out.println("Networking established");
    }

    private void sendMessage() {
        writer.println(outgoing.getText());
        writer.flush();

        outgoing.setText("");
        outgoing.requestFocus();
    }
}
