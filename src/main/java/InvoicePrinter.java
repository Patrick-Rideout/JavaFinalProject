import java.io.PrintStream;

/**
 * Responsible for printing invoice details to the specified PrintStream.
 */
public class InvoicePrinter {

    /**
     * Prints the entire invoice, including details like invoice number, dates, customer information, items, and payment instructions.
     *
     * @param invoice     The invoice object containing all the necessary details.
     * @param printStream The PrintStream to which the invoice will be printed.
     */
    public void printInvoice(Invoice invoice, PrintStream printStream) {
        printStream.println("\u001B[32m================================================================");
        printStream.println("\u001B[31mRetro Computers");
        printStream.println("\u001B[32m123 Vintage Tech Street");
        printStream.println("Josh's House, PC 696969");
        printStream.println("Phone: (555) 123-4567");
        printStream.println("Email: joshtaylor@retrocomputers.com");
        printStream.println("================================================================");
        printStream.printf("Invoice Number: %d", invoice.getInvoiceNumber());
        printStream.printf("\nDate: %s", invoice.getFormattedInvoiceDate());
        printStream.printf("\nDue Date: %s", invoice.getFormattedDueDate());
        printStream.printf("\nBill To:");
        printStream.printf("\nCustomer Name: \u001B[32m%s", invoice.getCustomer().getName());
        printStream.printf("\nAddress: \u001B[32m%s", invoice.getCustomer().getAddress().getFormattedAddress());
        printInvoiceItems(invoice, printStream);
        printStream.println("\u001B[31mPayment Instructions:");
        printStream.println("\u001B[32mPlease make the payment by the due date mentioned above.");
        printStream.println("You can send your payment via check or by Josh meme's to the \naddress provided.");
        printStream.println("\nThank you for choosing Retro Computers!\u001B[0m");

    }

    /**
     * Prints the invoice items along with their quantities, prices, and totals.
     *
     * @param invoice     The invoice object containing the list of items to be printed.
     * @param printStream The PrintStream to which the invoice items will be printed.
     */
    public void printInvoiceItems(Invoice invoice, PrintStream printStream) {
        printStream.println("\n================================================================");
        printStream.println("\u001B[31mDescription                   Quantity     Price($)        Total");
        printStream.println("\u001B[32m----------------------------------------------------------------");
        for (InvoiceItem item : invoice.getInvoiceItems()) {
            if (item.getItem().description.length() > 30) {
                printStream.printf("%-30s%8d%13.2f%13.2f\n", item.getItem().description.substring(0, 30),
                        item.getQuantity(), item.getItem().price, item.calculateTotal());
            } else {
                printStream.printf("%-30s%8d%13.2f%13.2f\n", item.getItem().description,
                        item.getQuantity(), item.getItem().price, item.calculateTotal());
            }
        }
        printStream.println("----------------------------------------------------------------");
        printStream.printf("Subtotal: $%.2f\n", invoice.calculateSubtotal());
        printStream.printf("Tax(15):  $%.2f\n", invoice.calculateTax());
        printStream.println("----------------------------------------------------------------");
        printStream.printf("Total Amount Due: $%.2f\n", invoice.calculateTotalAmountDue());
        printStream.println("================================================================");
    }

}