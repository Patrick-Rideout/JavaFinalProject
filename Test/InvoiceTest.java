import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Test class for the Invoice class to verify class works as intended.
 */
public class InvoiceTest {

    /**
     * Test for verifying the retrieval of the invoice number.
     */
    @Test
    public void testGetInvoiceNumber() {
        int invoiceNumber = 1001;
        Customer customer = new Customer("Josh Taylor", new Address("123 Main St", "CBS", "NL", "12345"));
        ArrayList<InvoiceItem> invoiceItems = new ArrayList<>();
        Invoice invoice = new Invoice(invoiceNumber, customer, invoiceItems);

        assertEquals(invoiceNumber, invoice.getInvoiceNumber());
    }

    /**
     * Test for verifying the retrieval of the invoice date.
     */
    @Test
    public void testGetInvoiceDate() {
        Customer customer = new Customer("Josh Taylor", new Address("123 Main St", "CBS", "NL", "12345"));
        ArrayList<InvoiceItem> invoiceItems = new ArrayList<>();
        Invoice invoice = new Invoice(2002, customer, invoiceItems);

        assertEquals(LocalDate.now(), invoice.getInvoiceDate());
    }

    /**
     * Test for verifying the retrieval of the customer associated with the invoice.
     */
    @Test
    public void testGetCustomer() {
        Customer customer = new Customer("Josh Taylor", new Address("123 Main St", "CBS", "NL", "12345"));
        ArrayList<InvoiceItem> invoiceItems = new ArrayList<>();
        Invoice invoice = new Invoice(2002, customer, invoiceItems);

        assertEquals(customer, invoice.getCustomer());
    }

    /**
     * Test for verifying the retrieval of the invoice items list.
     */
    @Test
    public void testGetInvoiceItems() {
        Customer customer = new Customer("Josh Taylor", new Address("123 Main St", "CBS", "NL", "12345"));
        ArrayList<InvoiceItem> invoiceItems = new ArrayList<>();
        Invoice invoice = new Invoice(2002, customer, invoiceItems);

        ArrayList<InvoiceItem> items = invoice.getInvoiceItems();

        assertNotNull(items);
    }

    /**
     * Test for verifying the retrieval of the due date for the invoice.
     */
    @Test
    public void testGetDueDate() {
        Customer customer = new Customer("Josh Taylor", new Address("123 Main St", "CBS", "NL", "12345"));
        ArrayList<InvoiceItem> invoiceItems = new ArrayList<>();
        Invoice invoice = new Invoice(2002, customer, invoiceItems);

        assertEquals(LocalDate.now().plusDays(30), invoice.getDueDate());
    }

    /**
     * Test for verifying the retrieval of the formatted invoice date.
     */
    @Test
    public void testGetFormattedInvoiceDate() {
        Customer customer = new Customer("Josh Taylor", new Address("123 Main St", "CBS", "NL", "12345"));
        ArrayList<InvoiceItem> invoiceItems = new ArrayList<>();
        Invoice invoice = new Invoice(3003, customer, invoiceItems);

        assertNotNull(invoice.getFormattedInvoiceDate());
    }

    /**
     * Test for verifying the retrieval of the formatted due date.
     */
    @Test
    public void testGetFormattedDueDate() {
        Customer customer = new Customer("Josh Taylor", new Address("123 Main St", "CBS", "NL", "12345"));
        ArrayList<InvoiceItem> invoiceItems = new ArrayList<>();
        Invoice invoice = new Invoice(3003, customer, invoiceItems);

        assertNotNull(invoice.getFormattedDueDate());
    }

    /**
     * Test for verifying the calculation of the subtotal for the invoice items.
     */
    @Test
    public void testCalculateSubtotal() {
        Customer customer = new Customer("Josh Taylor", new Address("123 Main St", "CBS", "NL", "12345"));
        Catalog catalog = new Catalog();
        ArrayList<InvoiceItem> invoiceItems = new ArrayList<>();
        InvoiceItem item = new InvoiceItem(catalog.getProductList().get(0), 1);
        invoiceItems.add(item);
        Invoice invoice = new Invoice(5005, customer, invoiceItems);

        assertEquals(120, invoice.calculateSubtotal());
    }

    /**
     * Test for verifying the calculation of the tax for the invoice.
     */
    @Test
    public void testCalculateTax() {
        Customer customer = new Customer("Josh Taylor", new Address("123 Main St", "CBS", "NL", "12345"));
        Catalog catalog = new Catalog();
        ArrayList<InvoiceItem> invoiceItems = new ArrayList<>();
        InvoiceItem item = new InvoiceItem(catalog.getProductList().get(0), 1);
        invoiceItems.add(item);
        Invoice invoice = new Invoice(5005, customer, invoiceItems);

        assertEquals(18.0, invoice.calculateTax());
    }

    /**
     * Test for verifying the calculation of the total amount due for the invoice.
     */
    @Test
    public void testCalculateTotalAmountDue() {
        Customer customer = new Customer("Josh Taylor", new Address("123 Main St", "CBS", "NL", "12345"));
        Catalog catalog = new Catalog();
        ArrayList<InvoiceItem> invoiceItems = new ArrayList<>();
        InvoiceItem item = new InvoiceItem(catalog.getProductList().get(0), 1);
        invoiceItems.add(item);
        Invoice invoice = new Invoice(5005, customer, invoiceItems);

        assertEquals(138.0, invoice.calculateTotalAmountDue());
    }
}
