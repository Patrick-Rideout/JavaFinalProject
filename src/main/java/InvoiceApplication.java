import java.io.PrintStream;
import java.util.Scanner;

public class InvoiceApplication {
    public static void main(String[] args) {

        PrintStream printstream = new PrintStream(System.out);

        Scanner input = new Scanner(System.in);

        Catalog catalog = new Catalog();

        System.out.println("Invoice Application.");
        while (true) {
            System.out.println("\nSelections:");
            System.out.println("""
                    0. Break
                    1. Print Catalog
                    2. Print Invoices
                    3. Create New Invoice""");

            System.out.println("\nENTER SELECTION:");
            String selection = input.nextLine();
            if (selection.equals("0")) {
                break;
            } else if (selection.equals("1")) {
                int i = 1;
                for (Product product : catalog.getProductList()) {
                    System.out.printf("Product %d: %s %s $%.2f\n", i, product.getId(), product.getDescription(), product.getPrice());
                    i++;
                }
                i = 1;
                for (Services services : catalog.getServiceArrayList()) {
                    System.out.printf("Service %d: %s %s $%.2f\n", i, services.getId(), services.getDescription(), services.getPrice());
                    i++;
                }

            } else if (selection.equals("2")) {

            } else if (selection.equals("3")) {
            }
        }

    }
}
