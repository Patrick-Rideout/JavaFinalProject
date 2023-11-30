import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class Invoice {
    private int invoiceNumber;
    private Customer customer;
    private ArrayList<InvoiceItem> invoiceItems;
    private LocalDate invoiceDate;
    private LocalDate dueDate;

    public Invoice(int invoiceNumber, Customer customer, ArrayList<InvoiceItem> invoiceItems) {
        this.invoiceNumber = invoiceNumber;
        this.customer = customer;
        this.invoiceItems = invoiceItems;
        this.invoiceDate = LocalDate.now();
        this.dueDate = this.invoiceDate.plusDays(30);
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

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getFormattedInvoiceDate() {
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        return invoiceDate.format(customFormatter);
    }

    public String getFormattedDueDate() {
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        return dueDate.format(customFormatter);
    }

    public double calculateSubtotal() {
        double total = 0;
        for (InvoiceItem item : this.getInvoiceItems()) {
            total += item.calculateTotal();
        }
        return total;
    }

    public double calculateTax() {
        double taxPercentage = 0.15;
        return calculateSubtotal() * taxPercentage;
    }

    public double calculateTotalAmountDue() {
        return this.calculateSubtotal() + this.calculateTax();
    }

}
