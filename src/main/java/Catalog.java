import java.io.PrintStream;
import java.util.ArrayList;

public class Catalog {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        InvoicePrinter invoicePrinter = new InvoicePrinter();
        Address address = new Address("21 Boyle Road", "Conception Bay South", "NL", "A1X 5n5");
        Customer customer = new Customer("Josh Taylor", address);
        Product product = new Product("Product A", 10.0);
        Services service = new Services(ServiceType.SERVICE1);
        InvoiceItem productItem = new InvoiceItem(product, 2);
        InvoiceItem serviceItem = new InvoiceItem(service, 2);
        double productTotal = productItem.calculateTotal();
        double serviceTotal = serviceItem.calculateTotal();
        ArrayList<InvoiceItem> items = new ArrayList<>();
        items.add(productItem);
        items.add(serviceItem);
        Invoice invoice = new Invoice(12345, customer, items);
        String formattedDate = invoice.getFormattedInvoiceDate();
        System.out.println("Formatted Invoice Date: " + formattedDate);
        invoicePrinter.printInvoice(invoice, printStream);





    }
}
