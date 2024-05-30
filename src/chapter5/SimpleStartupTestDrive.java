package chapter5;

import java.util.List;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        SimpleStartup dot = new SimpleStartup();

        var locations = List.of(2, 3, 4);
        dot.setLocationCells(locations);

        int userGuess = 2;
        String result = dot.checkYourself(userGuess);

        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}
