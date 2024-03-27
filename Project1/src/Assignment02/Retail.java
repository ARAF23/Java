package Assignment02;

/**
 * This class represents a retail property.
 * 
 * @author Wasi Omar Bin Bayzed
 */
public class Retail extends Property {
    // Instance variables
    private int squareFootage;
    private boolean customerParking;

    /**
     * Constructs a Retail object with the given parameters.
     *
     * @param price           The price of the retail property.
     * @param address         The address of the retail property.
     * @param propertyId      The ID of the retail property.
     * @param squareFootage   The square footage of the retail property.
     * @param customerParking Indicates if customer parking is available.
     */
    public Retail(double price, Address address, String propertyId, int squareFootage, boolean customerParking) {
        super(price, address, "retail", propertyId);
        this.squareFootage = squareFootage;
        this.customerParking = customerParking;
    }

    /**
     * Gets the square footage of the retail property.
     *
     * @return The square footage.
     */
    public int getSquareFootage() {
        return squareFootage;
    }

    /**
     * Indicates if customer parking is available at the retail property.
     *
     * @return true if customer parking is available, false otherwise.
     */
    public boolean hasCustomerParking() {
        return customerParking;
    }

    /**
     * Returns a string representation of the Retail object.
     *
     * @return A string displaying the state of the Retail object.
     */
    @Override
    public String toString() {
        return "Retail{" +
                "price=" + getPrice() +
                ", address=" + getAddress() +
                ", type='" + getType() + '\'' +
                ", propertyId='" + getPropertyId() + '\'' +
                ", squareFootage=" + squareFootage +
                ", customerParking=" + customerParking +
                '}';
    }
}
