public class Services extends BillableItems {

    private ServiceType type;
    private int quantity;


    public Services(ServiceType type) {
        super(type.getDescription(), type.getPrice());
        this.type = type;
        this.quantity = 1;
    }

    public ServiceType getType() {
        return type;
    }

    public void setType(ServiceType type) {
        this.type = type;
        setDescription(type.getDescription());
        setPrice(type.getPrice());
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public double calculateItemTotal() {
        return type.getPrice();
    }
}