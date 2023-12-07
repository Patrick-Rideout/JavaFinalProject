import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintStream;

public class Catalog {
    ArrayList<Product> productArrayList;
    ArrayList<Services> serviceArrayList;

    public Catalog() {
        this.productArrayList = new ArrayList<>();
        this.serviceArrayList = new ArrayList<>();
        this.buildProductList();
        this.buildServiceList();
    }

    public ArrayList<Product> getProductList(){
        return productArrayList;
    }

    public ArrayList<Services> getServiceArrayList() {
        return serviceArrayList;
    }

    private void buildProductList(){
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

    private void buildServiceList() {
        serviceArrayList.add(new Services(ServiceType.SERVICE1));
        serviceArrayList.add(new Services(ServiceType.SERVICE2));
        serviceArrayList.add(new Services(ServiceType.SERVICE3));
    }


//    public void getCatalog(){
//        PrintStream printStream = new PrintStream(System.out);
//        InvoicePrinter invoicePrinter = new InvoicePrinter();
//        Address address = new Address("60 Newfoundland Drive", "St. Johns", "Newfoundland", "A1X 5N8");
//        Customer customer = new Customer("Josh", address);
//        Invoice invoice = new Invoice(1001, customer, getProductList());
//        invoicePrinter.printInvoice(invoice, printStream);
//    }
//        productArrayList.add(new InvoiceItem(product1, 200));
//        productArrayList.add(new InvoiceItem(product2, 1));

}