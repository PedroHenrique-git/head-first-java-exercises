package chapter7_8;

public class Animal {
    protected String picture;
    protected String food;
    protected int hunger;
    protected String boundaries;
    protected int[] location;

    // cant be override
    public final void makeNoise() {
        System.out.println("some noise");
    }

    public void eat() {
        System.out.println("The animal is eating");
    }

    public void sleep() {
        System.out.println("The animal is sleeping");
    }

    public void roam() {
        System.out.println("The animal roaming");
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();

        b.append("Animal{ ");
        b.append("picture: " + picture);
        b.append(" ");
        b.append("food: " + food);
        b.append(" ");
        b.append("hunger: " + hunger);
        b.append(" ");
        b.append("boundaries: " + boundaries);
        b.append(" ");
        b.append("location: " + location);
        b.append(" }");

        return b.toString();
    }
}
