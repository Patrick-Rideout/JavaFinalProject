import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Catalog class to verify class works as intended.
 */
public class CatalogTest {

    /**
     * Test to verify the correctness of retrieving the product list from the catalog.
     */
    @Test
    public void testGetProductList() {
        Catalog catalog = new Catalog();
        ArrayList<Product> productList = catalog.getProductList();

        assertNotNull(productList);
        assertEquals(13, productList.size());
    }

    /**
     * Test to verify the correctness of retrieving the service list from the catalog.
     */
    @Test
    public void testGetServiceList() {
        Catalog catalog = new Catalog();
        ArrayList<Services> serviceList = catalog.getServiceList();

        assertNotNull(serviceList);
        assertEquals(3, serviceList.size());
    }
}
