package chapter18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LostUpdate {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(6);

        Balance balance = new Balance();

        for(int i = 0; i < 1000; i++) {
            pool.execute(balance::increment);
        }

        pool.shutdown();

        if(pool.awaitTermination(1, TimeUnit.MINUTES)) {
            System.out.println("Balance = " + balance.balance);
        }
    }
}
