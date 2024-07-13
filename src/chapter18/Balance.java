package chapter18;

import java.util.concurrent.atomic.AtomicInteger;

public class Balance {
    AtomicInteger balance = new AtomicInteger();

    public synchronized void increment() {
        balance.getAndIncrement();
    }
}
