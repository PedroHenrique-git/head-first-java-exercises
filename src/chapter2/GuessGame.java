package chapter2;

import java.util.Random;

public class GuessGame {
    Player one;
    Player two;
    Player three;
    int bound;

    public GuessGame() {
    }

    public GuessGame(Player one, Player two, Player three, int bound) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.bound = bound;
    }

    public Player getOne() {
        return one;
    }

    public void setOne(Player one) {
        this.one = one;
    }

    public Player getTwo() {
        return two;
    }

    public void setTwo(Player two) {
        this.two = two;
    }

    public Player getThree() {
        return three;
    }

    public void setThree(Player three) {
        this.three = three;
    }

    public int getBound() {
        return bound;
    }

    public void setBound(int bound) {
        this.bound = bound;
    }

    public void startGame() {
        int target = new Random().nextInt(bound);

        while (true) {
            int guessOne = one.guess(bound);
            int guessTwo = two.guess(bound);
            int guessThree = three.guess(bound);

            System.out.println("Player one guess the number: " + guessOne);
            System.out.println("Player two guess the number: " + guessTwo);
            System.out.println("Player three guess the number: " + guessThree);

            boolean oneWins = guessOne == target;
            boolean twoWins = guessTwo == target;
            boolean threeWins = guessThree == target;

            if (oneWins || twoWins || threeWins) {
                System.out.println("The player one wins? " + getResult(oneWins));
                System.out.println("The player two wins? " + getResult(twoWins));
                System.out.println("The player three wins? " + getResult(threeWins));

                break;
            } else {
                System.out.println("Nobody won this round!");
            }
        }

        System.out.println("The number was: " + target);
    }

    private String getResult(boolean win) {
        return win ? "Yes" : "No";
    }
}
