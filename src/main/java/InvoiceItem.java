/**
 * Represents an item in an invoice, consisting of a billable item and quantity.
 */
public class InvoiceItem {

    private BillableItems item;

    private int quantity;

    /**
     * Constructs an invoice item with the specified billable item and quantity.
     *
     * @param item     The billable item associated with the invoice item.
     * @param quantity The quantity of the billable item.
     */
    public InvoiceItem(BillableItems item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    /**
     * Retrieves the billable item associated with the invoice item.
     *
     * @return The billable item.
     */
    public BillableItems getItem() {
        return item;
    }

    /**
     * Sets the billable item associated with the invoice item.
     *
     * @param item The billable item to set.
     */
    public void setItem(BillableItems item) {
        this.item = item;
    }

    /**
     * Retrieves the quantity of the billable item.
     *
     * @return The quantity of the billable item.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the billable item.
     *
     * @param quantity The quantity to set.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Calculates the total price of the invoice item.
     *
     * @return The total price of the invoice item.
     */
    public double calculateTotal() {
        return item.getPrice() * this.quantity;
    }
}
