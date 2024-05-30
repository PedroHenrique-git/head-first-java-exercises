package chapter4;

public abstract class Person {
    void saySomething(String something) {
        System.out.println(something);
    }

    void saySomething(String s, String b) {
        System.out.println(s + " " + b);
    }

    abstract void sayHowOldAreYou();
}
