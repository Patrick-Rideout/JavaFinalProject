import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Product class to verify class works as intended.
 */
public class ProductTest {

    /**
     * Test for verifying the retrieval of the product's ID.
     */
    @Test
    public void testGetId() {
        String id = "1";
        Product product = new Product(id, "Sample Product", 100.0);

        assertEquals(id, product.getId());
    }

    /**
     * Test for verifying the setting of the product's ID.
     */
    @Test
    public void testSetId() {
        Product product = new Product("1", "Sample Product", 100.0);
        String newId = "2";

        product.setId(newId);

        assertEquals(newId, product.getId());
    }

    /**
     * Test for verifying the retrieval of the product's description.
     */
    @Test
    public void testGetDescription() {
        String description = "Sample Product";
        Product product = new Product("1", description, 100.0);

        assertEquals(description, product.getDescription());
    }

    /**
     * Test for verifying the setting of the product's description.
     */
    @Test
    public void testSetDescription() {
        Product product = new Product("1", "Sample Product", 100.0);
        String newDescription = "Updated";

        product.setDescription(newDescription);

        assertEquals(newDescription, product.getDescription());
    }

    /**
     * Test for verifying the retrieval of the product's price.
     */
    @Test
    public void testGetPrice() {
        double price = 100.0;
        Product product = new Product("1", "Sample Product", price);

        assertEquals(price, product.getPrice());
    }

    /**
     * Test for verifying the setting of the product's price.
     */
    @Test
    public void testSetPrice() {
        Product product = new Product("1", "Sample Product", 100.0);
        double newPrice = 150.0;

        product.setPrice(newPrice);

        assertEquals(newPrice, product.getPrice());
    }
}
