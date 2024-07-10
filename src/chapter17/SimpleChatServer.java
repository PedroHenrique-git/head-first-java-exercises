package chapter17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleChatServer {
    private final List<PrintWriter> clientWriters = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        new SimpleChatServer().go();
    }

    public void go() throws IOException {
        ExecutorService threadPool = Executors.newCachedThreadPool();

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(5000));

        while(serverSocketChannel.isOpen()) {
            SocketChannel clientSocket =  serverSocketChannel.accept();
            PrintWriter writer = new PrintWriter(Channels.newWriter(clientSocket, StandardCharsets.UTF_8));
            clientWriters.add(writer);

            threadPool.submit(new ClientHandler(clientSocket));

            System.out.println("got a connection");
        }
    }

    private void tellEveryone(String message) {
        for(PrintWriter writer : clientWriters) {
            writer.println(message);
            writer.flush();
        }
    }

    public class ClientHandler implements  Runnable {
        BufferedReader reader;
        SocketChannel socket;

        public ClientHandler(SocketChannel client) {
            socket = client;
            reader = new BufferedReader(Channels.newReader(socket, StandardCharsets.UTF_8));
        }

        @Override
        public void run() {
            String message;
            try {
                while((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    tellEveryone(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
