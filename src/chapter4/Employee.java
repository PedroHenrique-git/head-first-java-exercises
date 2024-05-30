package chapter4;

public class Employee extends Person {
    @Override
    void sayHowOldAreYou() {
        System.out.println("I am 23 years old!");
    }

    @Override
    void saySomething(String something) {
        super.saySomething(something + " override");
    }
}
