package battleship;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Boat> boats = new ArrayList<>();
    private String[] linesLabels = { "A", "B", "C", "D", "E", "F", "G" };
    private int lines = 7;
    private int rows = 7;

    public Board(List<Boat> boats) {
        this.boats = boats;
    }

    public List<Boat> getBoats() {
        return boats;
    }

    public void setBoats(List<Boat> boats) {
        this.boats = boats;
    }

    public void renderBoard() {
        System.out.println();

        for (int i = 0; i < lines; i++) {

            System.out.print(linesLabels[i] + "\t");

            for (int j = 0; j < rows; j++) {
                String coordinate = linesLabels[i] + j;
                Boat boat = boats.stream().filter(b -> b.getBoxes().keySet().contains(coordinate)).findFirst()
                        .orElse(null);

                if (boat != null && boat.getBoxes().get(coordinate)) {
                    System.out.print("x ");
                } else {
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("\t0 1 2 3 4 5 6");
        System.out.println();
    }

    public boolean finish() {
        return boats.stream().allMatch(b -> b.getBoxes().values().stream().allMatch(v -> v));
    }
}
