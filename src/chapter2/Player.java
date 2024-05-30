package chapter2;

import java.util.Random;

public class Player {
    public Player() {
    }

    int guess(int bound) {
        return new Random().nextInt(bound);
    }
}
