package chapter5;

import java.util.Arrays;
import java.util.Random;

public class BattleshipGame {
    private int[][] grid;

    private final Random random = new Random();
    static final int LINES = 7;
    static final int COLUMNS = 7;

    public BattleshipGame() {
        initGrid();
    }

    private void initGrid() {
        this.grid = new int[LINES][COLUMNS];

        for (int i = 0; i < 3; i++) {
            int line = random.nextInt(LINES);

            int startCell = random.nextInt(COLUMNS);
            int middleCell = startCell == 6 ? startCell - 1 : startCell + 1;
            int endCell = startCell == 6 ? middleCell - 1 : middleCell + 1;

            if (startCell <= COLUMNS - 1)
                grid[line][startCell] = 1;

            if (middleCell <= COLUMNS - 1)
                grid[line][middleCell] = 1;

            if (endCell <= COLUMNS - 1)
                grid[line][endCell] = 1;
        }

    }

    public String verifyResponse(String coordinate) {
        for (int i = 0; i < LINES; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                String[] c = coordinate.split("");

                int line = Arrays.asList(Constants.ROWS_NAMES).indexOf(c[0]);
                int cell = Integer.parseInt(c[1]);

                if (grid[line][cell] == 1) {
                    grid[line][cell] = 0;

                    return "hit";
                }
            }
        }

        return "miss";
    }

    public boolean finish() {
        for (int i = 0; i < LINES; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (grid[i][j] == 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }
}
