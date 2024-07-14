package appendix;

public record Customer(int id, String name) {
    public Customer {
        if(id < 0)
            System.out.println("Invalid id");
    }
}
