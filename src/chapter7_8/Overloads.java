package chapter7_8;

public class Overloads {
    public static void main(String[] args) {
        System.out.println(addNumbers(10, 10));
        System.out.println(addNumbers(10, 10, 10));
        System.out.println(addNumbers(10, 10));
    }

    public static int addNumbers(int n1, int n2) {
        return n1 + n2;
    }

    public static double addNumbers(double n1, double n2) {
        return n1 + n2;
    }

    public static double addNumbers(double n1, double n2, double n3) {
        return n1 + n2 + n3;
    }
}
