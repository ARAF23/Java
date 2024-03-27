package Assignment02;

/**
 * This class represents a Property.
 * 
 * @author Wasi Omar Bin Bayzed
 */
public class Property {
    // Instance variables
    private double price;
    private Address address;
    private String type;
    private String propertyId;

    private static final int MIN_PROPERTY_ID_LENGTH = 1;
    private static final int MAX_PROPERTY_ID_LENGTH = 6;
    private static final int PRICE_THRESHOLD = 0;

    /**
     * Constructs a Property object with the given price, address, type, and
     * property ID.
     *
     * @param price      The price of the property.
     * @param address    The address of the property.
     * @param type       The type of the property ("residence", "commercial", or
     *                   "retail").
     * @param propertyId The ID of the property.
     * @throws IllegalArgumentException if the property ID length is invalid.
     */
    public Property(double price, Address address, String type, String propertyId) {
        setPrice(price); // Set the price using the setter method
        this.address = address;
        if (!type.equals("residence") && !type.equals("commercial") && !type.equals("retail")) {
            throw new IllegalArgumentException("Type must be one of 'residence', 'commercial', or 'retail'");
        }
        this.type = type;
        if (propertyId.length() < MIN_PROPERTY_ID_LENGTH || propertyId.length() > MAX_PROPERTY_ID_LENGTH) {
            throw new IllegalArgumentException("Property ID must be between " + MIN_PROPERTY_ID_LENGTH + " and "
                    + MAX_PROPERTY_ID_LENGTH + " characters long");
        }
        this.propertyId = propertyId;
    }

    /**
     * Gets the price of the property.
     *
     * @return The price of the property.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the property.
     *
     * @param price The price of the property to set.
     * @throws IllegalArgumentException if the price is negative.
     */
    public void setPrice(double price) {
        if (price < PRICE_THRESHOLD) {
            throw new IllegalArgumentException("Price must be a positive number");
        }
        this.price = price;
    }

    /**
     * Gets the address of the property.
     *
     * @return The address of the property.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Gets the type of the property.
     *
     * @return The type of the property.
     */
    public String getType() {
        return type;
    }

    /**
     * Gets the ID of the property.
     *
     * @return The ID of the property.
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * Returns a string representation of the Property object.
     *
     * @return A string displaying the state of the Property object.
     */
    @Override
    public String toString() {
        return "Property{" +
                "price=" + price +
                ", address=" + address +
                ", type='" + type + '\'' +
                ", propertyId='" + propertyId + '\'' +
                '}';
    }
}
