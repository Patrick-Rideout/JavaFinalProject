import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintStream;

/**
 * Represents a catalog containing lists of products and services.
 */
public class Catalog {
    ArrayList<Product> productArrayList;
    ArrayList<Services> serviceArrayList;

    /**
     * Constructs a catalog and initializes product and service lists.
     */
    public Catalog() {
        this.productArrayList = new ArrayList<>();
        this.serviceArrayList = new ArrayList<>();
        this.buildProductList();
        this.buildServiceList();
    }

    /**
     * Retrieves the list of products in the catalog.
     *
     * @return The list of products.
     */
    public ArrayList<Product> getProductList() {
        return productArrayList;
    }

    /**
     * Retrieves the list of services in the catalog.
     *
     * @return The list of services.
     */
    public ArrayList<Services> getServiceList() {
        return serviceArrayList;
    }

    /**
     * Builds the initial list of products in the catalog.
     */
    private void buildProductList() {
        productArrayList.add(new Product("CP001", "Intel Pentium III Processor", 120.00));
        productArrayList.add(new Product("MB002", "ASUS P3B Motherboard", 150.00));
        productArrayList.add(new Product("HD003", "Seagate Barracuda 20GB HDD", 100.00));
        productArrayList.add(new Product("RM004", "Kingston ValueRAM 128MB SDRAM", 30.00));
        productArrayList.add(new Product("VC005", "ATI Rage 128 Pro Graphics Card", 70.00));
        productArrayList.add(new Product("CD006", "Sony CD-RW Drive", 45.00));
        productArrayList.add(new Product("PS007", "Generic 350W Power Supply", 35.00));
        productArrayList.add(new Product("CS008", "Creative Sound Blaster Live! Sound Card", 50.00));
        productArrayList.add(new Product("MN009", "Dell 17-inch CRT Monitor", 80.00));
        productArrayList.add(new Product("KY010", "Logitech PS/2 Keyboard", 20.00));
        productArrayList.add(new Product("MS011", "Microsoft Intellimouse", 15.00));
        productArrayList.add(new Product("FN012", "Case Fan 80mm", 10.00));
        productArrayList.add(new Product("FN013", "Large metal case", 70.00));
    }

    /**
     * Builds the initial list of services in the catalog.
     */
    private void buildServiceList() {
        serviceArrayList.add(new Services(ServiceType.SERVICE1));
        serviceArrayList.add(new Services(ServiceType.SERVICE2));
        serviceArrayList.add(new Services(ServiceType.SERVICE3));
    }

    /**
     * Prints the catalog details including products and services to the specified PrintStream.
     *
     * @param printStream The PrintStream where the catalog details will be printed.
     */
    public void printCatalog(PrintStream printStream) {
        printStream.println("Products:");
        printStream.printf("%-12s %-10s %-40s %-10s\n", "Product", "ID", "Description", "Price");
        int i = 1;
        for (Product product : getProductList()) {
            printStream.printf("%-12s %-10s %-40s $%.2f\n", "Product " + i, product.getId(), product.getDescription(), product.getPrice());
            i++;
        }

        printStream.println("\nServices:");
        printStream.printf("%-12s %-10s %-40s %-10s\n", "Service", "ID", "Description", "Price");
        i = 1;
        for (Services services : getServiceList()) {
            printStream.printf("%-12s %-10s %-40s $%.2f\n", "Service " + i, services.getId(), services.getDescription(), services.getPrice());
            i++;
        }
    }
}