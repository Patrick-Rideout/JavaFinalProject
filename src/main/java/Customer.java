/**
 * Represents a customer with a name and address.
 */
public class Customer {

    private String name;
    private Address address;

    /**
     * Constructs a customer with the specified name and address.
     *
     * @param name    The name of the customer.
     * @param address The address of the customer.
     */
    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Retrieves the address of the customer.
     *
     * @return The address of the customer.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the address of the customer.
     *
     * @param address The address to set for the customer.
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Retrieves the name of the customer.
     *
     * @return The name of the customer.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the customer.
     *
     * @param name The name to set for the customer.
     */
    public void setName(String name) {
        this.name = name;
    }
}