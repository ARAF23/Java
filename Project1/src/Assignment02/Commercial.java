package Assignment02;

/**
 * This class represents a commercial property.
 * 
 * @author Wasi Omar Bin Bayzed
 */
public class Commercial extends Property {
    // Instance variables
    private boolean loadingDock;
    private boolean highwayAccess;

    /**
     * Constructs a Commercial object with the given parameters.
     *
     * @param price         The price of the commercial property.
     * @param address       The address of the commercial property.
     * @param propertyId    The ID of the commercial property.
     * @param loadingDock   Indicates if the commercial property has a loading dock.
     * @param highwayAccess Indicates if the commercial property has highway access.
     */
    public Commercial(double price, Address address, String propertyId, boolean loadingDock, boolean highwayAccess) {
        super(price, address, "commercial", propertyId);
        this.loadingDock = loadingDock;
        this.highwayAccess = highwayAccess;
    }

    /**
     * Indicates if the commercial property has a loading dock.
     *
     * @return true if the commercial property has a loading dock, false otherwise.
     */
    public boolean hasLoadingDock() {
        return loadingDock;
    }

    /**
     * Indicates if the commercial property has highway access.
     *
     * @return true if the commercial property has highway access, false otherwise.
     */
    public boolean hasHighwayAccess() {
        return highwayAccess;
    }

    /**
     * Returns a string representation of the Commercial object.
     *
     * @return A string displaying the state of the Commercial object.
     */
    @Override
    public String toString() {
        return "Commercial{" +
                "price=" + getPrice() +
                ", address=" + getAddress() +
                ", type='" + getType() + '\'' +
                ", propertyId='" + getPropertyId() + '\'' +
                ", loadingDock=" + loadingDock +
                ", highwayAccess=" + highwayAccess +
                '}';
    }
}
