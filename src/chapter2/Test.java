package chapter2;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.bark();

        Movie one = new Movie();

        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;

        Movie two = new Movie();

        two.title = "Lost int Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;

        Movie three = new Movie();

        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }
}
