package chapter1;

public class DooBee {
    public void showMessage() {
        int x = 1;

        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");

            x += 1;
        }

        if (x == 3) {
            System.out.print("Do");
        }
    }
}
