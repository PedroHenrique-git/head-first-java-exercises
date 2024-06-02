package chapter9;

public class App {
    public static void main(String[] args) {
        final int SIZE = 10;

        Duck[] ducks = new Duck[SIZE];

        for(int i = 0; i < SIZE; i++) {
            ducks[i] = new Duck(i * 10, "duck " + i);
        }

        for(Duck d : ducks) {
            System.out.println("The duck name is: " + d.name);
            System.out.println("The size of the duck is: " + d.size);
        }

        System.out.println("Number of ducks instances " + Duck.instances);
    }
}
