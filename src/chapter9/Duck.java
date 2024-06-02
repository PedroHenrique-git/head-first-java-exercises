package chapter9;

public class Duck extends Animal {
    int size = 0;
    public static int instances = 0;

    public Duck() {
        super("");
    }

    public Duck(int size, String name) {
        super(name);

        instances += 1;

        this.size = size;

        System.out.println("Quack!!!");
    }
}
