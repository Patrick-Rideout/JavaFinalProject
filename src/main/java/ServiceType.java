public enum ServiceType {
    SERVICE1("Service1", "Computer Assemble", 125.0),
    SERVICE2("Service2","Defragment Hard Drive", 25.0),
    SERVICE3("Service3","General Repair", 27.5);

    private final String Id;
    private final String description;
    private final double price;

    ServiceType(String Id, String description, double price) {
        this.Id = Id;
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return Id;
    }
    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}