package chapter7_8;

public class Dog extends Animal implements Pet {
    @Override
    public void beFriendly() {
        System.out.println("Being friendly");
    }

    @Override
    public void play() {
        System.out.println("plying");
    }
}
