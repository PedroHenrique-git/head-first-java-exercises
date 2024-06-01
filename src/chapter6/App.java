package chapter6;

import java.util.ArrayList;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        log.info("This is a log");

        ArrayList<Egg> eggs = new ArrayList<>();

        var eggOne = new Egg("egg 1");
        var eggTwo = new Egg("egg 2");
        var eggThree = new Egg("egg 3");
        var eggFour = new Egg("egg 4");
        var eggFive = new Egg("egg 5");
        var eggSix = new Egg("egg 6");

        eggs.add(eggOne);
        eggs.add(eggTwo);
        eggs.add(eggThree);
        eggs.add(eggFour);
        eggs.add(eggFive);

        if (eggs.contains(eggOne)) {
            System.out.println("Yes!!!");
        } else {
            System.out.println("No!!!");
        }

        if (eggs.contains(eggSix)) {
            System.out.println("Yes!!!");
        } else {
            System.out.println("No!!!");
        }
    }
}
