import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the InvoiceItem class to verify class works as intended.
 */
public class InvoiceItemTest {

    /**
     * Test for verifying the retrieval of the billable item associated with the invoice item.
     */
    @Test
    public void testGetItem() {
        BillableItems billableItem = new BillableItems("1001", "Sample", 50.0);
        InvoiceItem invoiceItem = new InvoiceItem(billableItem, 2);

        assertEquals(billableItem, invoiceItem.getItem());
    }

    /**
     * Test for verifying the setting of the billable item associated with the invoice item.
     */
    @Test
    public void testSetItem() {
        BillableItems billableItem = new BillableItems("1001", "Sample", 50.0);
        InvoiceItem invoiceItem = new InvoiceItem(null, 1);

        invoiceItem.setItem(billableItem);

        assertEquals(billableItem, invoiceItem.getItem());
    }

    /**
     * Test for verifying the retrieval of the quantity of the billable item.
     */
    @Test
    public void testGetQuantity() {
        BillableItems billableItem = new BillableItems("itemID", "Sample Item", 50.0);
        InvoiceItem invoiceItem = new InvoiceItem(billableItem, 3);

        assertEquals(3, invoiceItem.getQuantity());
    }

    /**
     * Test for verifying the setting of the quantity of the billable item.
     */
    @Test
    public void testSetQuantity() {
        BillableItems billableItem = new BillableItems("itemID", "Sample Item", 50.0);
        InvoiceItem invoiceItem = new InvoiceItem(billableItem, 1);

        invoiceItem.setQuantity(5);

        assertEquals(5, invoiceItem.getQuantity());
    }

    /**
     * Test for verifying the calculation of the total price of the invoice item.
     */
    @Test
    public void testCalculateTotal() {
        BillableItems billableItem = new BillableItems("itemID", "Sample Item", 50.0);
        InvoiceItem invoiceItem = new InvoiceItem(billableItem, 2);

        assertEquals(100.0, invoiceItem.calculateTotal());
    }
}
