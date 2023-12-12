/**
 * Represents an address with street, city, province, and postal code information.
 */
public class Address {

    private String street;
    private String city;
    private String province;
    private String postalCode;

    /**
     * Constructs an address with specified street, city, province, and postal code.
     *
     * @param street     The street information.
     * @param city       The city information.
     * @param province   The province information.
     * @param postalCode The postal code information.
     */
    public Address(String street, String city, String province, String postalCode) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    /**
     * Retrieves the street information.
     *
     * @return The street information as a String.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Retrieves the city information.
     *
     * @return The city information as a String.
     */
    public String getCity() {
        return city;
    }

    /**
     * Retrieves the province information.
     *
     * @return The province information as a String.
     */
    public String getProvince() {
        return province;
    }

    /**
     * Retrieves the postal code information.
     *
     * @return The postal code information as a String.
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Gets the formatted address string including street, city, province, and postal code.
     *
     * @return The formatted address string.
     */
    public String getFormattedAddress() {
        return this.street + '\n' + this.city + ", " + this.province + ' ' + this.postalCode;
    }
}
