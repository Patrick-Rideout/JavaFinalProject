import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Address class to verify class works as intended.
 */
public class AddressTest {

    /**
     * Test to verify the correctness of the getFormattedAddress method with specific address details.
     */
    @Test
    public void testGetFormattedAddress() {
        String street = "123 Main St";
        String city = "CBS";
        String province = "NL";
        String postalCode = "12345";
        Address address = new Address(street, city, province, postalCode);

        String formattedAddress = address.getFormattedAddress();

        String expectedFormattedAddress = "123 Main St\nCBS, NL 12345";
        assertEquals(expectedFormattedAddress, formattedAddress);
    }
}