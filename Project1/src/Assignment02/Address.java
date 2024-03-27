package Assignment02;

/**
 * Represents an address with unit number, street number, street name, postal
 * code, and city.
 *
 * @author Wasi Omar Bin Bayzed
 * @version 1.0
 */

public class Address {
    // Instance Variables
    private String unitNumber;
    private int streetNumber;
    private String streetName;
    private String postalCode;
    private String city;

    private static final int MIN_LENGTH = 1;
    private static final int MAX_UNIT_LENGTH = 4;
    private static final int MAX_STREET_NUMBER = 999999;
    private static final int MAX_STREET_NAME_LENGTH = 20;
    private static final int MIN_POSTAL_LENGTH = 5;
    private static final int MAX_POSTAL_LENGTH = 6;
    private static final int MAX_CITY_LENGTH = 30;

    /**
     * Constructor for Address objects.
     * 
     * @param unitNumber   The unit number of the address.
     * @param streetNumber The street number of the address.
     * @param streetName   The street name of the address.
     * @param postalCode   The postal code of the address.
     * @param city         The city of the address.
     */
    public Address(String unitNumber, int streetNumber, String streetName, String postalCode, String city) {

        if (streetNumber < MIN_LENGTH || streetNumber > MAX_STREET_NUMBER) {
            throw new IllegalArgumentException(
                    "Street number must be between " + MIN_LENGTH + " and " + MAX_STREET_NUMBER + ".");
        }
        if (streetName.length() < MIN_LENGTH || streetName.length() > MAX_STREET_NAME_LENGTH) {
            throw new IllegalArgumentException("Street name must be between " + MIN_LENGTH + " and "
                    + MAX_STREET_NAME_LENGTH + " characters long.");
        }
        if (postalCode.length() != MIN_POSTAL_LENGTH && postalCode.length() != MAX_POSTAL_LENGTH) {
            throw new IllegalArgumentException("Postal code must be either " + MIN_POSTAL_LENGTH + " or "
                    + MAX_POSTAL_LENGTH + " characters long.");
        }
        if (city.length() < MIN_LENGTH || city.length() > MAX_CITY_LENGTH) {
            throw new IllegalArgumentException(
                    "City must be between " + MIN_LENGTH + " and " + MAX_CITY_LENGTH + " characters long.");
        }

        this.unitNumber = unitNumber;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.city = city;
    }

    /**
     * Getter method for the unit number.
     * 
     * @return The unit number of the address.
     */
    public String getUnitNumber() {

        if (unitNumber.length() < MIN_LENGTH || unitNumber.length() > MAX_UNIT_LENGTH) {
            throw new IllegalArgumentException(
                    "Unit number must be between " + MIN_LENGTH + " and " + MAX_UNIT_LENGTH + " characters long.");
        }
        return unitNumber;
    }

    /**
     * Getter method for the street number.
     * 
     * @return The street number of the address.
     */
    public int getStreetNumber() {
        return streetNumber;
    }

    /**
     * Getter method for the street name.
     * 
     * @return The street name of the address.
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Getter method for the postal code.
     * 
     * @return The postal code of the address.
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Getter method for the city.
     * 
     * @return The city of the address.
     */
    public String getCity() {
        return city;
    }

    /**
     * Returns a string representation of the Address object.
     * 
     * @return A string displaying the state of Address object.
     */
    @Override
    public String toString() {
        return "Address{" +
                "unitNumber='" + unitNumber + '\'' +
                ", streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
