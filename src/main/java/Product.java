/**
 * Represents a product as a billable item with an ID, description, and price.
 * Inherits from the BillableItems class.
 */
public class Product extends BillableItems {

    /**
     * Constructs a Product with the specified ID, description, and price.
     *
     * @param id          The ID of the product.
     * @param description The description of the product.
     * @param price       The price of the product.
     */
    public Product(String id, String description, double price) {
        super(id, description, price);
    }
}
