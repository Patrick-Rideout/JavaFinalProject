import java.io.PrintStream;

public class InvoicePrinter {
    public void printInvoice(Invoice invoice, PrintStream printStream) {
       printStream.println( "\u001B[32m======================================================");
       printStream.println("\u001B[31mRetro Computers");
       printStream.println("\u001B[32m123 Vintage Tech Street");
       printStream.println("Josh's House, PC 696969");
       printStream.println("Phone: (555) 123-4567");
       printStream.println( "Email: joshtaylor@retrocomputers.com");
       printStream.println( "======================================================");
       printStream.printf("Invoice Number: %d", invoice.getInvoiceNumber());
       printStream.printf("\nDate: %s", invoice.getInvoiceDate());
       printStream.printf("\nDue Date: %s", invoice.getFormattedDueDate());
       printStream.printf("\nBill To:");
       printStream.printf("\nCustomer Name: \u001B[32m%s", invoice.getCustomer().getName());
       printStream.printf("\nAddress: \u001B[32m%s", invoice.getCustomer().getAddress().getFormattedAddress());
       printStream.println( "\n======================================================");
       printStream.println( "\u001B[31mDescription                  Quantity    Unit Price    Total");
       printStream.println( "\u001B[32m---------------------------------------------------------");
       printInvoiceItems(invoice, printStream);
       printStream.println( "---------------------------------------------------------");
       printStream.printf( "Subtotal: %.2f\n", invoice.calculateSubtotal());
       printStream.printf( "Tax(15): %.2f\n", invoice.calculateTax());
       printStream.println("---------------------------------------------------------");
       printStream.printf( "Total Amount Due: %.2f\n", invoice.calculateTotalAmountDue());
       printStream.println( "======================================================");
       printStream.println( "\u001B[31mPayment Instructions:");
       printStream.println( "\u001B[32mPlease make the payment by the due date mentioned above.");
       printStream.println( "You can send your payment via check or by Josh meme's to the address provided.");
       printStream.println( "\nThank you for choosing Retro Computers!");

    }

   public void printInvoiceItems(Invoice invoice, PrintStream printStream) {
      for (InvoiceItem item : invoice.getInvoiceItems()) {
         printStream.printf("%s                       %d         %.2f        %.2f\n",item.getItem().description,
                 item.getQuantity(), item.getItem().price, item.calculateTotal());
      }
   }

}
