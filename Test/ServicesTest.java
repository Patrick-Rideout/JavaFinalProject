import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Services class to verify class works as intended.
 */
public class ServicesTest {

    /**
     * Test for verifying the retrieval of the service type.
     */
    @Test
    public void testGetType() {
        Services service = new Services(ServiceType.SERVICE1);

        assertEquals(ServiceType.SERVICE1, service.getType());
    }

    /**
     * Test for verifying the retrieval of the service's ID.
     */
    @Test
    public void testGetId() {
        Services service = new Services(ServiceType.SERVICE1);

        assertEquals(ServiceType.SERVICE1.getId(), service.getId());
    }

    /**
     * Test for verifying the retrieval of the service's description.
     */
    @Test
    public void testGetDescription() {
        Services service = new Services(ServiceType.SERVICE1);

        assertEquals(ServiceType.SERVICE1.getDescription(), service.getDescription());
    }

    /**
     * Test for verifying the retrieval of the service's price.
     */
    @Test
    public void testGetPrice() {
        Services service = new Services(ServiceType.SERVICE1);

        assertEquals(ServiceType.SERVICE1.getPrice(), service.getPrice());
    }
}
