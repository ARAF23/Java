package Assignment02;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Represents a real estate agency that manages a collection of properties.
 * 
 * @author wasi omar bin bayzed
 */
public class Agency {
    /**
     * The name of the agency.
     */
    private String name;

    /**
     * The collection of properties managed by the agency.
     */
    private HashMap<String, Property> properties;

    /**
     * Constructs a new agency with the given name.
     *
     * @param name the name of the agency
     */
    public Agency(String name) {
        this.name = name;
        this.properties = new HashMap<>();
    }

    /**
     * Adds a new property to the agency's collection of properties.
     *
     * @param property the property to add
     */
    public void addProperty(Property property) {
        if (property != null) {
            properties.put(property.getPropertyId(), property);
        }
    }

    /**
     * Removes a property from the agency's collection of properties.
     *
     * @param propertyId the ID of the property to remove
     */
    public void removeProperty(String propertyId) {
        properties.remove(propertyId);
    }

    /**
     * Retrieves a property from the agency's collection of properties.
     *
     * @param propertyId the ID of the property to retrieve
     * @return the property with the given ID, or null if no such property exists
     */
    public Property getProperty(String propertyId) {
        return properties.get(propertyId);
    }

    /**
     * Calculates and returns the total value of all properties managed by the
     * agency.
     *
     * @return the total value of all properties managed by the agency
     */
    public double getTotalPropertyValues() {
        double totalValue = 0;
        for (Property property : properties.values()) {
            totalValue += property.getPrice();
        }
        return totalValue;
    }

    /**
     * Retrieves a list of all properties managed by the agency that have swimming
     * pools.
     *
     * @return a list of properties with pools
     */
    public ArrayList<Residence> getPropertiesWithPools() {
        ArrayList<Residence> propertiesWithPools = new ArrayList<>();
        for (Property property : properties.values()) {
            if (property instanceof Residence) {
                Residence residence = (Residence) property;
                if (residence.hasSwimmingPool()) {
                    propertiesWithPools.add(residence);
                }
            }
        }
        return propertiesWithPools;
    }

    /**
     * Retrieves a list of all properties managed by the agency that are within the
     * specified price range.
     *
     * @param minUsd the minimum price (in USD)
     * @param maxUsd the maximum price (in USD)
     * @return a list of properties within the specified price range
     */
    public ArrayList<Property> getPropertiesBetween(double minUsd, double maxUsd) {
        ArrayList<Property> propertiesInRange = new ArrayList<>();
        for (Property property : properties.values()) {
            if (property.getPrice() >= minUsd && property.getPrice() <= maxUsd) {
                propertiesInRange.add(property);
            }
        }
        return propertiesInRange.isEmpty() ? null : propertiesInRange;
    }

    /**
     * Retrieves a list of all addresses for properties managed by the agency that
     * are located on the specified street.
     *
     * @param streetName the name of the street
     * @return a list of addresses for properties on the specified street
     */
    public ArrayList<Address> getPropertiesOn(String streetName) {
        ArrayList<Address> propertiesOnStreet = new ArrayList<>();
        for (Property property : properties.values()) {
            if (property.getAddress().getStreetName().equalsIgnoreCase(streetName)) {
                propertiesOnStreet.add(property.getAddress());
            }
        }
        return propertiesOnStreet.isEmpty() ? null : propertiesOnStreet;
    }

    /**
     * Retrieves a list of all properties managed by the agency that have a
     * specified number of bedrooms.
     *
     * @param minBedrooms the minimum number of bedrooms
     * @param maxBedrooms the maximum number of bedrooms
     * @return a list of properties with the specified number of bedrooms
     */
    public HashMap<String, Residence> getPropertiesWithBedrooms(int minBedrooms, int maxBedrooms) {
        HashMap<String, Residence> propertiesWithBedrooms = new HashMap<>();
        for (Property property : properties.values()) {
            if (property instanceof Residence) {
                Residence residence = (Residence) property;
                int bedrooms = residence.getNumberOfBedrooms();
                if (bedrooms >= minBedrooms && bedrooms <= maxBedrooms) {
                    propertiesWithBedrooms.put(residence.getPropertyId(), residence);
                }
            }
        }
        return propertiesWithBedrooms.isEmpty() ? null : propertiesWithBedrooms;
    }

    /**
     * Retrieves a list of all properties managed by the agency of the specified
     * type.
     *
     * @param propertyType the type of property
     * @return a list of properties of the specified type
     */
    public ArrayList<Property> getPropertiesOfType(String propertyType) {
        ArrayList<Property> propertiesOfType = new ArrayList<>();
        for (Property property : properties.values()) {
            if (property.getType().equalsIgnoreCase(propertyType)) {
                propertiesOfType.add(property);
            }
        }
        return propertiesOfType.isEmpty() ? null : propertiesOfType;
    }

    /**
     * Retrieves a list of all commercial properties managed by the agency that have
     * loading docks.
     *
     * @return a list of commercial properties with loading docks
     */
    public ArrayList<Commercial> getPropertiesWithLoadingDock() {
        ArrayList<Commercial> propertiesWithLoadingDock = new ArrayList<>();
        for (Property property : properties.values()) {
            if (property instanceof Commercial) {
                Commercial commercial = (Commercial) property;
                if (commercial.hasLoadingDock()) {
                    propertiesWithLoadingDock.add(commercial);
                }
            }
        }
        return propertiesWithLoadingDock;
    }

    /**
     * Retrieves a list of all commercial properties managed by the agency that have
     * highway access.
     *
     * @return a list of commercial properties with highway access
     */
    public ArrayList<Commercial> getPropertiesWithHighwayAccess() {
        ArrayList<Commercial> propertiesWithHighwayAccess = new ArrayList<>();
        for (Property property : properties.values()) {
            if (property instanceof Commercial) {
                Commercial commercial = (Commercial) property;
                if (commercial.hasHighwayAccess()) {
                    propertiesWithHighwayAccess.add(commercial);
                }
            }
        }
        return propertiesWithHighwayAccess;
    }

    /**
     * Retrieves a list of all retail properties managed by the agency that have a
     * specified amount of square footage.
     *
     * @param squareFootage the minimum square footage
     * @return a list of retail properties with the specified square footage
     */
    public ArrayList<Retail> getPropertiesWithSquareFootage(int squareFootage) {
        ArrayList<Retail> propertiesWithSquareFootage = new ArrayList<>();
        for (Property property : properties.values()) {
            if (property instanceof Retail) {
                Retail retail = (Retail) property;
                if (retail.getSquareFootage() >= squareFootage) {
                    propertiesWithSquareFootage.add(retail);
                }
            }
        }
        return propertiesWithSquareFootage;
    }

    /**
     * Retrieves a list of all retail properties managed by the agency that have
     * customer parking.
     *
     * @return a list of retail properties with customer parking
     */
    public ArrayList<Retail> getPropertiesWithCustomerParking() {
        ArrayList<Retail> propertiesWithCustomerParking = new ArrayList<>();
        for (Property property : properties.values()) {
            if (property instanceof Retail) {
                Retail retail = (Retail) property;
                if (retail.hasCustomerParking()) {
                    propertiesWithCustomerParking.add(retail);
                }
            }
        }
        return propertiesWithCustomerParking;
    }

    /**
     * Retrieves a list of all residential properties managed by the agency that are
     * part of a strata.
     *
     * @return a list of residential properties that are part of a strata
     */
    public ArrayList<Residence> getPropertiesWithStrata() {
        ArrayList<Residence> propertiesWithStrata = new ArrayList<>();
        for (Property property : properties.values()) {
            if (property instanceof Residence) {
                Residence residence = (Residence) property;
                if (residence.isStrata()) {
                    propertiesWithStrata.add(residence);
                }
            }
        }
        return propertiesWithStrata;
    }
}