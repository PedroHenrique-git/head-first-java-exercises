package chapter5;

import java.util.Scanner;

public class BattleshipLauncher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BattleshipGame b = new BattleshipGame();

        renderBoard(b.getGrid());

        while (true) {
            System.out.print("Make a guess: ");
            String guess = s.next();

            System.out.println(b.verifyResponse(guess));

            if (b.finish()) {
                break;
            }
        }

        System.out.println("You destroy all the ships!");
    }

    public static void renderBoard(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            System.out.print(Constants.ROWS_NAMES[i] + "  ");

            for (int j = 0; j < grid[i].length; j++) {
                int cell = grid[i][j];

                System.out.print(cell + " ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.print("  ");

        for (int i = 0; i < grid.length; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
    }
}
