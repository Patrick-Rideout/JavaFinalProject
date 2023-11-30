import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class Invoice {
    private int invoiceNumber;
    private LocalDate invoiceDate;
    private Customer customer;
    private ArrayList<InvoiceItem> invoiceItems;

    public Invoice(int invoiceNumber, Customer customer, ArrayList<InvoiceItem> invoiceItems) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = LocalDate.now();
        this.customer = customer;
        this.invoiceItems = invoiceItems;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(ArrayList<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

    public String getFormattedInvoiceDate() {
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        return invoiceDate.format(customFormatter);
    }

    public double calculateSubtotal() {
        double total = 0;
        for (InvoiceItem item : this.getInvoiceItems()) {
            total += item.calculateTotal();
        }
        return total;
    }

    public double calculateTax() {
        // Calculate tax (15% of the invoice amount)
        double taxPercentage = 0.15; // 15%
        double taxAmount = calculateSubtotal() * taxPercentage;
        return taxAmount;
    }

    public double calculateTotalAmountDue() {
        return this.calculateSubtotal() + this.calculateTax();
    }

}
