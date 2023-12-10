import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the ServiceType enum to verify class works as intended.
 */
public class ServiceTypeTest {

    /**
     * Test for verifying the retrieval of the unique identifier of a service type.
     */
    @Test
    public void testGetId() {
        String actualId = ServiceType.SERVICE1.getId();

        assertEquals("Service1", actualId);
    }

    /**
     * Test for verifying the retrieval of the description of a service type.
     */
    @Test
    public void testGetDescription() {
        String actualDescription = ServiceType.SERVICE1.getDescription();

        assertEquals("Computer Assemble Service", actualDescription);
    }

    /**
     * Test for verifying the retrieval of the price of a service type.
     */
    @Test
    public void testGetPrice() {
        double actualPrice = ServiceType.SERVICE1.getPrice();

        assertEquals(125.0, actualPrice);
    }
}
