public class Product extends BillableItems {
    private String description;
    private double price;
    private int quantity;

    public Product(String description, double price) {
        super(description, price);
    }

}