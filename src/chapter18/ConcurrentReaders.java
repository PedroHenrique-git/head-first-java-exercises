package chapter18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class Chat {
    private final String message;
    private final LocalDateTime timestamp;

    public Chat(String message) {
        this.message = message;
        timestamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        String time = timestamp.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

        return time + " " + message;
    }
}

public class ConcurrentReaders {
    public static void main(String[] args) {
        List<Chat> chatHistory = new CopyOnWriteArrayList<>();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i = 0; i < 5; i++) {
            executor.execute(() -> chatHistory.add(new Chat("Hi there!")));
            executor.execute(() -> System.out.println(chatHistory));
            executor.execute(() -> System.out.println(chatHistory));
        }

        executor.shutdown();
    }
}
