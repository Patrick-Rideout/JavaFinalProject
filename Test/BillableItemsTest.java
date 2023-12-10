import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the BillableItems class to verify class works as intended.
 */
public class BillableItemsTest {

    /**
     * Test to verify the correctness of getting the ID of the billable item.
     */
    @Test
    public void testGetId() {
        String id = "1";
        String description = "Sample Item";
        double price = 25.99;
        BillableItems billableItem = new BillableItems(id, description, price);

        String retrievedId = billableItem.getId();

        assertEquals(id, retrievedId);
    }

    /**
     * Test to verify the correctness of setting the description of the billable item.
     */
    @Test
    public void testSetDescription() {
        String id = "2";
        String description = "Description";
        double price = 19.99;
        BillableItems billableItem = new BillableItems(id, description, price);

        String newDescription = "Updated Description";
        billableItem.setDescription(newDescription);

        assertEquals(newDescription, billableItem.getDescription());
    }

    /**
     * Test to verify the correctness of getting the price of the billable item.
     */
    @Test
    public void testGetPrice() {
        String id = "3";
        String description = "Sample Item 2";
        double price = 35.50;
        BillableItems billableItem = new BillableItems(id, description, price);

        double retrievedPrice = billableItem.getPrice();

        assertEquals(price, retrievedPrice);
    }

    /**
     * Test to verify the correctness of setting the price of the billable item.
     */
    @Test
    public void testSetPrice() {
        String id = "4";
        String description = "Yet Another Item";
        double price = 50.00;
        BillableItems billableItem = new BillableItems(id, description, price);

        double newPrice = 60.00;
        billableItem.setPrice(newPrice);

        assertEquals(newPrice, billableItem.getPrice());
    }
}