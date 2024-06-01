package chapter7_8;

public class App {
    public static void main(String[] args) {
        Test<Integer> t = new Test<>();
        Animal a = new Lion();
        Pet p = new Dog();

        t.value = 1;
        System.out.println("Value: " + t.value.toString());

        Lion l = new Lion();

        System.out.println(a.toString());

        l.eat();
        l.makeNoise();
        l.roam();
        l.sleep();
        p.beFriendly();
        p.play();
    }
}
