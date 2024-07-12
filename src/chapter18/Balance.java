package chapter18;

public class Balance {
    int balance = 0;

    public synchronized void increment() {
        balance++;
    }
}
