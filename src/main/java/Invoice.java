import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Represents an invoice with details such as invoice number, customer information, invoice items, and dates.
 */
class Invoice {
    private int invoiceNumber;
    private Customer customer;
    private ArrayList<InvoiceItem> invoiceItems;
    private LocalDate invoiceDate;
    private LocalDate dueDate;

    /**
     * Constructs an invoice with specified details.
     *
     * @param invoiceNumber The unique invoice number.
     * @param customer      The customer associated with the invoice.
     * @param invoiceItems  List of invoice items.
     */
    public Invoice(int invoiceNumber, Customer customer, ArrayList<InvoiceItem> invoiceItems) {
        this.invoiceNumber = invoiceNumber;
        this.customer = customer;
        this.invoiceItems = invoiceItems;
        this.invoiceDate = LocalDate.now();
        this.dueDate = this.invoiceDate.plusDays(30);
    }

    /**
     * Retrieves the unique invoice number.
     *
     * @return The invoice number.
     */
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the unique invoice number.
     *
     * @param invoiceNumber The invoice number to set.
     */
    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    /**
     * Retrieves the date when the invoice was created.
     *
     * @return The invoice date.
     */
    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the date when the invoice was created.
     *
     * @param invoiceDate The invoice date to set.
     */
    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    /**
     * Retrieves the customer associated with the invoice.
     *
     * @return The customer associated with the invoice.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the customer associated with the invoice.
     *
     * @param customer The customer to associate with the invoice.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Retrieves the list of invoice items.
     *
     * @return The list of invoice items.
     */
    public ArrayList<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    /**
     * Sets the list of invoice items.
     *
     * @param invoiceItems The list of invoice items to set.
     */
    public void setInvoiceItems(ArrayList<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

    /**
     * Retrieves the due date for the invoice payment.
     *
     * @return The due date for the invoice payment.
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * Sets the due date for the invoice payment.
     *
     * @param dueDate The due date for the invoice payment to set.
     */
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Retrieves the formatted invoice date.
     *
     * @return The formatted invoice date as a string.
     */
    public String getFormattedInvoiceDate() {
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        return invoiceDate.format(customFormatter);
    }

    /**
     * Retrieves the formatted due date.
     *
     * @return The formatted due date as a string.
     */
    public String getFormattedDueDate() {
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        return dueDate.format(customFormatter);
    }

    /**
     * Calculates the subtotal of the invoice items.
     *
     * @return The subtotal of the invoice.
     */
    public double calculateSubtotal() {
        double total = 0;
        for (InvoiceItem item : this.getInvoiceItems()) {
            total += item.calculateTotal();
        }
        return total;
    }

    /**
     * Calculates the tax based on the subtotal.
     *
     * @return The calculated tax.
     */
    public double calculateTax() {
        double taxPercentage = 0.15;
        return calculateSubtotal() * taxPercentage;
    }

    /**
     * Calculates the total amount due (subtotal + tax) for the invoice.
     *
     * @return The total amount due for the invoice.
     */
    public double calculateTotalAmountDue() {
        return this.calculateSubtotal() + this.calculateTax();
    }
}
