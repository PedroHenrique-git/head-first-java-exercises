package chapter18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        RyanAndMonicaJob ryan = new RyanAndMonicaJob("Ryan", account, 50);
        RyanAndMonicaJob monica = new RyanAndMonicaJob("Monica", account, 100);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(ryan);
        executor.execute(monica);
        executor.shutdown();
    }
}
