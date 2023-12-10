import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Customer class to verify class works as intended.
 */
public class CustomerTest {

    /**
     * Test to verify the initialization of a customer with name and address.
     */
    @Test
    public void testCustomerInitialization() {
        String name = "Josh Paylor";
        Address address = new Address("123 Main St", "CBS", "NL", "12345");

        Customer customer = new Customer(name, address);

        assertEquals(name, customer.getName());
        assertEquals(address, customer.getAddress());
    }

    /**
     * Test to verify the correctness of setting a new address for the customer.
     */
    @Test
    public void testSetAddress() {
        String name = "Josh Taylor";
        Address address = new Address("21 Lush St", "CBS", "NL", "21212");
        Customer customer = new Customer(name, address);

        Address newAddress = new Address("21 Oak St", "New City", "New Province", "12345");
        customer.setAddress(newAddress);

        assertEquals(newAddress, customer.getAddress());
    }

    /**
     * Test to verify the correctness of setting a new name for the customer.
     */
    @Test
    public void testSetName() {
        String name = "Jim";
        Address address = new Address("21 First St", "CBS", "NL", "12345");
        Customer customer = new Customer(name, address);

        String newName = "Bob";
        customer.setName(newName);

        assertEquals(newName, customer.getName());
    }
}
