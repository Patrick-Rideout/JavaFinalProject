import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class InvoiceApplication {
    public static void main(String[] args) {

        PrintStream printStream = new PrintStream(System.out);

        InvoicePrinter invoicePrinter = new InvoicePrinter();

        Scanner input = new Scanner(System.in);

        Random random = new Random();

        Catalog catalog = new Catalog();

        System.out.println("Invoice Application.");
        while (true) {
            System.out.println("\nSelections:");
            System.out.println("""
                    0. Break
                    1. Print Catalog
                    2. Print Tosh Baylor's Invoice
                    3. Create New Invoice
                    4. Random Invoice""");
            System.out.println("\nENTER SELECTION:");
            String selection = input.nextLine();
            if (selection.equals("0")) {
                break;
            } else if (selection.equals("1")) {
                catalog.printCatalog(printStream);
            } else if (selection.equals("2")) {

                Address customerAddress = new Address("123 Real Street", "St. John’s", "NL", "A1X 6R3");
                Customer customer = new Customer("Tosh Bayler", customerAddress );
                ArrayList<InvoiceItem> customerList = new ArrayList<>();

                int[] numbers = {0, 1, 2, 3, 4, 6, 12};

                for (int i: numbers) {

                    InvoiceItem item;
                    if (i == 3) {
                        item = new InvoiceItem(catalog.getProductList().get(i), 2);
                    }
                    else {
                        item = new InvoiceItem(catalog.getProductList().get(i), 1);
                    }
                    customerList.add(item);
                }
                InvoiceItem item = new InvoiceItem(catalog.getServiceList().get(0), 1);
                customerList.add(item);
                Invoice invoice = new Invoice(random.nextInt(1000, 9999), customer, customerList);
                invoicePrinter.printInvoice(invoice, printStream);

            } else if (selection.equals("3")) {

                System.out.println("\nEnter Name:");
                String name = input.nextLine();
                System.out.println("\nEnter Street:");
                String street = input.nextLine();
                System.out.println("\nEnter City:");
                String city = input.nextLine();
                System.out.println("\nEnter Province:");
                String province = input.nextLine();
                System.out.println("\nEnter Postal Code:");
                String postalCode = input.nextLine();
                Address address = new Address(street, city, province, postalCode);
                Customer customer = new Customer(name, address);
                ArrayList<InvoiceItem> customerList = new ArrayList<>();
                while (true) {

                    System.out.println("\nPurchase another item?(Y or N):");
                    String selection2 = input.nextLine();
                    if (selection2.equalsIgnoreCase("N")) {
                        break;
                    }
                    else if (selection2.equalsIgnoreCase("Y")) {

                        System.out.println("\nService or Product?(S or P):");
                        String selection3 = input.nextLine();
                        if (selection3.equalsIgnoreCase("S")) {
                            System.out.println("\nService ID:");
                            int id = input.nextInt();
                            InvoiceItem item = new InvoiceItem(catalog.getServiceList().get(id-1), 1);
                            customerList.add(item);
                            input.nextLine();
                        }
                        else if (selection3.equalsIgnoreCase("P")) {

                            System.out.println("\nItem ID:");
                            int id = input.nextInt();
                            System.out.println("\nItem Quantity:");
                            int quantity = input.nextInt();
                            InvoiceItem item = new InvoiceItem(catalog.getProductList().get(id-1), quantity);
                            customerList.add(item);
                            input.nextLine();
                        }
                    }
                }
                Invoice invoice = new Invoice(random.nextInt(1000, 9999), customer, customerList);
                invoicePrinter.printInvoice(invoice, printStream);
            }

            else if (selection.equals("4")) {
                Address customerAddress = new Address("123 Random Street", "St. Random’s", "RAN", "A1X 6R3");
                Customer customer = new Customer("Rand Daylor", customerAddress );
                ArrayList<InvoiceItem> customerList = new ArrayList<>();
                int[] numbers = {random.nextInt(0,13), random.nextInt(0,13), random.nextInt(0,13)};

                for (int i: numbers) {
                    InvoiceItem item;
                    item = new InvoiceItem(catalog.getProductList().get(i), random.nextInt(1, 10));
                    customerList.add(item);
                }

                InvoiceItem item = new InvoiceItem(catalog.getServiceList().get(random.nextInt(0,3)), 1);
                customerList.add(item);
                Invoice invoice = new Invoice(random.nextInt(1000, 9999), customer, customerList);
                invoicePrinter.printInvoice(invoice, printStream);
            }
        }
    }
}
