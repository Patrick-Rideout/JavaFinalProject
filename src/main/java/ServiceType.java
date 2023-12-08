/**
 * Enum representing different types of services with specific IDs, descriptions, and prices.
 */
public enum ServiceType {

    SERVICE1("Service1", "Computer Assemble Service", 125.0),

    SERVICE2("Service2", "Defragment Hard Drive Service", 25.0),

    SERVICE3("Service3", "General Repair(Hourly) Service", 27.5);

    private final String Id;

    private final String description;

    private final double price;

    /**
     * Constructor for the ServiceType enum with ID, description, and price.
     *
     * @param Id          The unique identifier of the service type.
     * @param description The description of the service type.
     * @param price       The price of the service type.
     */
    ServiceType(String Id, String description, double price) {
        this.Id = Id;
        this.description = description;
        this.price = price;
    }

    /**
     * Retrieves the unique identifier of the service type.
     *
     * @return The unique identifier of the service type.
     */
    public String getId() {
        return Id;
    }

    /**
     * Retrieves the description of the service type.
     *
     * @return The description of the service type.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Retrieves the price of the service type.
     *
     * @return The price of the service type.
     */
    public double getPrice() {
        return price;
    }
}
