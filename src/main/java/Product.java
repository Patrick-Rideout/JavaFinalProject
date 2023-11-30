public class Product extends BillableItems {

    private int quantity;

    public Product(String description, double price, int quantity) {
        super(description, price);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double calculateItemTotal() {
        return quantity * getPrice();
    }
}