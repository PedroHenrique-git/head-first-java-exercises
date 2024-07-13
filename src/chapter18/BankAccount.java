package chapter18;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount {
    private final AtomicInteger balance = new AtomicInteger();

    public int getBalance() {
        return balance.get();
    }

    public void spend(String name, int amount) {
       int initialBalance = balance.get();

       if(initialBalance >= amount) {
           boolean success = balance.compareAndSet(initialBalance, initialBalance - amount);

           if(!success)
               System.out.println("Sorry " + name + ", you haven`t spent the money");
       } else {
           System.out.println("Sorry, not enough for " + name);
       }
    }

    public final class ImmutableData {
        private final String name;
        private final int value;

        public ImmutableData(String name, int value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return this.name;
        }

        public  int getValue() {
            return this.value;
        }
    }
}
