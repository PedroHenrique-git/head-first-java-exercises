package chapter18;

public class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public synchronized void spend(String name, int amount) {
        if(balance >= amount) {
            balance -= amount;

            if(balance < 0) {
                System.out.println("Overdrawn!");
            }
        } else {
            System.out.println("Sorry, not enough for " + name);

        }    }
}
