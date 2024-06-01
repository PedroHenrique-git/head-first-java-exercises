package battleship;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    static final Scanner scanner = new Scanner(System.in);
    static final Random random = new Random();
    static final String[] LINES_LABELS = { "A", "B", "C", "D", "E", "F", "G" };

    public static void main(String[] args) {
        List<String> listOne = Arrays.asList(generateCoordinate());
        List<String> listTwo = Arrays.asList(generateCoordinate());
        List<String> listThree = Arrays.asList(generateCoordinate());

        Boat boatOne = new Boat(listOne);
        Boat boatTwo = new Boat(listTwo);
        Boat boatThree = new Boat(listThree);

        Board b = new Board(Arrays.asList(boatOne, boatTwo, boatThree));

        while (true) {
            System.out.print("Enter a guess ");
            String guess = scanner.next();

            String validationBoatOne = boatOne.check(guess);
            String validationBoatTwo = boatTwo.check(guess);
            String validationBoatThree = boatThree.check(guess);

            if (validationBoatOne.equals("hit") || validationBoatTwo.equals("hit") || validationBoatThree.equals("hit")) {
                System.out.println("hit");
            } else {
                System.out.println("miss");
            }

            b.renderBoard();

            if (b.finish()) {
                System.out.println("\nYou win! you destroy all boats");

                break;
            }
        }
    }

    public static String[] generateCoordinate() {
        String row = LINES_LABELS[random.nextInt(7)];

        int startCell = random.nextInt(7);
        int middleCell = startCell == 6 ? startCell - 1 : startCell + 1;
        int endCell = startCell == 6 ? middleCell - 1 : middleCell + 1;

        int[] sortedCells = new int[] { startCell, middleCell, endCell };

        Arrays.sort(sortedCells);

        return new String[] { row + sortedCells[0], row + sortedCells[1], row + sortedCells[2] };
    }
}
