package chapter4;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        /*
         * Employee e = new Employee();
         * 
         * e.saySomething("Hello, i am an Employee!");
         * e.sayHowOldAreYou();
         * e.saySomething("A", "B");
         */

        int size = 10;

        Dog[] dogs = new Dog[size];

        for (int i = 0; i < 10; i++) {
            String name = i == 0 ? "Dog 1" : String.format("Dog %d", i);
            double with = i == 0 ? 10.0 : 10.0 * i;
            double height = i == 0 ? 10.0 : 10.0 * i;

            Dog dog = new Dog(name, with, height);

            dogs[i] = dog;
        }

        Arrays.asList(dogs).stream().forEach(dog -> {
            System.out.println("Name: " + dog.getName());
            System.out.println("Width: " + dog.getWidth());
            System.out.println("Height: " + dog.getHeight());
            System.out.println();
        });

        System.out.println("Is equal?" + dogs[0].equals(dogs[1]));
    }
}
