package chapter5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimpleStartupGame {
    static final int BOUND = 7;

    public static void main(String[] args) {
        SimpleStartup dot = new SimpleStartup();
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int numberOfHits = 0;

        int startCell = r.nextInt(BOUND);
        int middleCell = startCell == 6 ? startCell - 1 : startCell + 1;
        int endCell = startCell == 6 ? middleCell - 1 : middleCell + 1;

        System.out.println(startCell + " " + middleCell + " " + endCell);

        var locations = new ArrayList<Integer>();

        locations.add(startCell);
        locations.add(middleCell);
        locations.add(endCell);

        dot.setLocationCells(locations);

        while (true) {
            System.out.print("Enter a number ");
            String guess = s.next();

            String result = dot.checkYourself(Integer.parseInt(guess));

            System.out.println(result);

            numberOfHits++;

            if (result.equals("kill")) {
                System.out.println("You took " + numberOfHits + " guesses");
                break;
            }
        }
    }
}
