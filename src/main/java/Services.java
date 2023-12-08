/**
 * Represents a service as a billable item with a specific type, ID, description, and price.
 * Inherits from the BillableItems class.
 */
public class Services extends BillableItems {

    private ServiceType type;

    /**
     * Constructs a service with the specified service type.
     *
     * @param type The service type.
     */
    public Services(ServiceType type) {
        super(type.getId(), type.getDescription(), type.getPrice());
        this.type = type;
    }

    /**
     * Retrieves the type of service.
     *
     * @return The type of service.
     */
    public ServiceType getType() {
        return type;
    }

    /**
     * Sets the type of service.
     *
     * @param type The service type to set.
     */
    public void setType(ServiceType type) {
        this.type = type;
        setDescription(type.getDescription());
        setPrice(type.getPrice());
    }
}
