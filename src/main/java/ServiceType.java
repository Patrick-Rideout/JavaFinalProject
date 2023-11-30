public enum ServiceType {
    SERVICE1("Service 1", 15.0),
    SERVICE2("Service 2", 25.0);

    private final String description;
    private final double price;

    ServiceType(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}