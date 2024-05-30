package chapter2;

import java.util.Random;

public class GameLaucher {
    public static void main(String[] args) {
        int bound = new Random().nextInt(100000);

        var playerOne = new Player();
        var playerTwo = new Player();
        var playerThree = new Player();

        GuessGame g = new GuessGame(playerOne, playerTwo, playerThree, bound);

        g.startGame();
    }
}
