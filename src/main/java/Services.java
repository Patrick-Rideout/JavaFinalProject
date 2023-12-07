public class Services extends BillableItems {

    private ServiceType type;

    public Services(ServiceType type) {
        super(type.getId(), type.getDescription(), type.getPrice());
        this.type = type;
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
    public double calculateItemTotal() {
        return type.getPrice();
    }


}