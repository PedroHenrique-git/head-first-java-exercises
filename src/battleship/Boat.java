package battleship;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Boat {
    private Map<String, Boolean> boxes = new HashMap<>();
    private int numberOfHits = 0;

    public Boat(List<String> cells) {
        cells.forEach(c -> boxes.put(c, false));
    }

    public Map<String, Boolean> getBoxes() {
        return boxes;
    }

    public int getNumberOfHits() {
        return numberOfHits;
    }

    public void setNumberOfHits(int numberOfHits) {
        this.numberOfHits = numberOfHits;
    }

    public String check(String cell) {
        numberOfHits++;

        if (boxes.containsKey(cell)) {
            boxes.put(cell, true);

            return "hit";
        }

        return "miss";
    }
}
