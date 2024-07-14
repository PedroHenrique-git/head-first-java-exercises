package appendix;

public class App {
    public static void main(String[] args) {
        Customer customer = new Customer(7, "me");
        Customer customerTwo = new Customer(-1, "me");

        System.out.println(customer);
        System.out.println(customer.name());
    }
}
