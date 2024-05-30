package chapter1;

import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = { "agnostic", "opinionated", "void activated", "haptically driven", "extensible",
                "reactive", "agent based", "functional", "AI enabled", "strongly typed" };

        String[] wordListTwo = { "loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "Iot",
                "cloud native", "service oriented", "containerized", "serverless", "microservices",
                "distributed ledger" };

        String[] wordListThree = { "framework", "library", "DSL", "REST API", "repository", "pipeline", "service mesh",
                "architecture", "perspective", "design", "orientation" };

        Random randomGenerator = new Random();

        int randOne = randomGenerator.nextInt(wordListOne.length);
        int randTwo = randomGenerator.nextInt(wordListTwo.length);
        int randThree = randomGenerator.nextInt(wordListThree.length);

        String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];

        System.out.println(phrase);
    }
}
