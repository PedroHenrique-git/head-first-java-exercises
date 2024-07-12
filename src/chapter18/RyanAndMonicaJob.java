package chapter18;

public class RyanAndMonicaJob implements Runnable {
    private final BankAccount account;
    private final String name;
    private final int amountToSpend;

    public RyanAndMonicaJob(String name, BankAccount account, int amountToSpend) {
        this.name = name;
        this.account = account;
        this.amountToSpend = amountToSpend;
    }

    @Override
    public void run() {
        goShopping(amountToSpend);
    }

    private void goShopping(int amount) {
        System.out.println(name + " is about to spend");

        account.spend(name, amount);

        System.out.println(name + " spent " + amount + " dollars");
    }
}
