public class InvoiceItem {

    private BillableItems item;
    private int quantity;

    public InvoiceItem(BillableItems item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public BillableItems getItem() {
        return item;
    }

    public void setItem(BillableItems item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return item.getPrice() * this.quantity;
    }
}