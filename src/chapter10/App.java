package chapter10;

import java.text.NumberFormat;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        FinalClass c = new FinalClass();
        long x = Math.round(42.2);
        int y = Math.min(56, 12);
        int z = Math.abs(-343);
        double r1 = Math.random();
        int r2 = (int) (Math.random() * 5);

        Integer iWrap = 288;

        System.out.println(iWrap.intValue());

        final int a = 10;

        // Error
        // a = 11;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(Math.min(10, 4));
        System.out.println(Math.max(10, 4));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(9, 2));

        var maxMemory = Runtime.getRuntime().maxMemory();
        var freeMemory = Runtime.getRuntime().freeMemory();

        System.out.println(freeMemory);

        System.out.println(ConstantInit.X);

        System.out.println(Integer.parseInt("10"));
        System.out.println(Double.parseDouble("10.50"));
        System.out.println(Boolean.parseBoolean("True"));
        System.out.println(String.valueOf(10.50));

        double amount = 200.0;
        Locale l = new Locale("pt", "BR");
        NumberFormat f = NumberFormat.getCurrencyInstance(l);

        System.out.println(f.format(amount));

        long hardTpRead = 10000000;
        long easierToRead = 1_000_000_000;
        long legalButSilly = 10_0000_0000;

        System.out.println(String.format("%,d", legalButSilly));
        System.out.println(String.format("I have %.2f, bugs to fix.", 476578.09876));
        System.out.println(String.format("I have %,.2f, bugs to fix.", 476578.09876));
    }
}
