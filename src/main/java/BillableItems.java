/**
 * Represents items that can be billed, containing information such as ID, description, and price.
 */
public class BillableItems {

    private String id;
    protected String description;
    protected double price;

    /**
     * Constructs a billable item with the specified ID, description, and price.
     *
     * @param id          The unique identifier of the billable item.
     * @param description The description of the billable item.
     * @param price       The price of the billable item.
     */
    public BillableItems(String id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    /**
     * Gets the ID of the billable item.
     *
     * @return The ID of the billable item.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID of the billable item.
     *
     * @param id The ID to set for the billable item.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the description of the billable item.
     *
     * @return The description of the billable item.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the billable item.
     *
     * @param description The description to set for the billable item.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the price of the billable item.
     *
     * @return The price of the billable item.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the billable item.
     *
     * @param price The price to set for the billable item.
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
