package chapter17;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) {
        try {
            InetSocketAddress serverAddress = new InetSocketAddress("localhost", 5000);
            SocketChannel socketChannel = SocketChannel.open(serverAddress);

            Reader reader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);
            Writer writer = Channels.newWriter(socketChannel, StandardCharsets.UTF_8);

            BufferedReader bufferedReader = new BufferedReader(reader);
            PrintWriter printWriter = new PrintWriter(writer);

            String message = bufferedReader.readLine();

            printWriter.println("message to send");
            printWriter.print("another message");

            System.out.println(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
