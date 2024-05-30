package chapter5;

import java.util.List;

public class SimpleStartup {
    private List<Integer> locationCells;
    private int numberOfHits;

    public int getNumberOfHits() {
        return numberOfHits;
    }

    public void setNumberOfHits(int numberOfHits) {
        this.numberOfHits = numberOfHits;
    }

    public List<Integer> getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(List<Integer> locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(int guess) {
        String result = "miss";

        int index = locationCells.indexOf(guess);

        if (index >= 0) {
            locationCells.remove(index);
        }

        if (locationCells.isEmpty()) {
            result = "kill";
        }

        numberOfHits++;

        return result;
    }
}
