package Assignment02;

/**
 * This class represents a residence property.
 * 
 * @author Wasi Omar Bin Bayzed
 */
public class Residence extends Property {
    // Instance variables
    private int numberOfBedrooms;
    private boolean swimmingPool;
    private boolean strata;

    private static final int MIN_BEDROOMS = 1;

    /**
     * Constructs a Residence object with the given parameters.
     *
     * @param price            The price of the residence.
     * @param address          The address of the residence.
     * @param propertyId       The ID of the residence.
     * @param numberOfBedrooms The number of bedrooms in the residence.
     * @param swimmingPool     Indicates if the residence has a swimming pool.
     * @param strata           Indicates if the residence is part of a strata.
     * @throws IllegalArgumentException if the number of bedrooms is less than 1.
     */
    public Residence(double price, Address address, String propertyId, int numberOfBedrooms, boolean swimmingPool,
            boolean strata) {
        super(price, address, "residence", propertyId);
        if (numberOfBedrooms < MIN_BEDROOMS) {
            throw new IllegalArgumentException("Number of bedrooms must be at least " + MIN_BEDROOMS);
        }
        this.numberOfBedrooms = numberOfBedrooms;
        this.swimmingPool = swimmingPool;
        this.strata = strata;
    }

    /**
     * Gets the number of bedrooms in the residence.
     *
     * @return The number of bedrooms.
     */
    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    /**
     * Indicates if the residence has a swimming pool.
     *
     * @return true if the residence has a swimming pool, false otherwise.
     */
    public boolean hasSwimmingPool() {
        return swimmingPool;
    }

    /**
     * Indicates if the residence is part of a strata.
     *
     * @return true if the residence is part of a strata, false otherwise.
     */
    public boolean isStrata() {
        return strata;
    }

    /**
     * Returns a string representation of the Residence object.
     *
     * @return A string displaying the state of the Residence object.
     */
    @Override
    public String toString() {
        return "Residence{" +
                "price=" + getPrice() +
                ", address=" + getAddress() +
                ", type='" + getType() + '\'' +
                ", propertyId='" + getPropertyId() + '\'' +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", swimmingPool=" + swimmingPool +
                ", strata=" + strata +
                '}';
    }
}
