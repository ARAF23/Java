
package Assignment02;

/**
 * Driver class to demonstrate the functionality of the Agency, Address, and
 * Property classes.
 * Use the main method to create Property objects and test various methods of
 * the Agency class.
 *
 * @author Wasi Omar Bin Bayzed
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Driver {
        /**
         * Reference to the Agency object
         */
        private Agency agency;
        /**
         * Scanner object for user input
         */
        private Scanner scanner;

        public Driver() {
                this.agency = new Agency("Sample Agency");
                this.scanner = new Scanner(System.in);
        }

        /**
         * Initializes the Agency object by reading data from files and adding Property
         * objects to the Agency.
         *
         * @throws FileNotFoundException if the files are not found
         */
        public void init() throws FileNotFoundException {
                // Read address data from a file

                File addressFile = new File("address_data.txt");
                ArrayList<Address> addresses = AddressReader.readAddressData(addressFile);

                // Read property data from a file
                File propertyFile = new File("property_data.txt");
                ArrayList<String> propertyData = PropertyReader.readPropertyData(propertyFile);

                // Create Property objects and add them to the Agency
                for (int i = 0; i < propertyData.size(); i++) {
                        String[] data = propertyData.get(i).split("\\|");
                        // String propertyId = data[0];
                        double price = Double.parseDouble(data[0]);
                        String residenceType = data[3];
                        String otherType = data[1];

                        // Get the address for this property
                        Address address = addresses.get(i);

                        // Create a Property object based on the type
                        if (residenceType.equalsIgnoreCase("residence")) {
                                String propertyId = data[4];
                                int numberOfBedrooms = Integer.parseInt(data[1]);
                                boolean swimmingPool = Boolean.parseBoolean(data[2]);
                                boolean strata = Boolean.parseBoolean(data[5]);
                                Residence residence = new Residence(price, address, propertyId, numberOfBedrooms,
                                                swimmingPool, strata);
                                agency.addProperty(residence);
                        } else if (otherType.equalsIgnoreCase("commercial")) {
                                String propertyId = data[2];

                                boolean loadingDock = Boolean.parseBoolean(data[3]);
                                boolean highwayAccess = Boolean.parseBoolean(data[4]);
                                Commercial commercial = new Commercial(price, address, propertyId, loadingDock,
                                                highwayAccess);
                                agency.addProperty(commercial);
                        } else if (otherType.equalsIgnoreCase("retail")) {
                                String propertyId = data[2];

                                int squareFootage = Integer.parseInt(data[3]);
                                boolean customerParking = Boolean.parseBoolean(data[4]);
                                Retail retail = new Retail(price, address, propertyId, squareFootage, customerParking);
                                agency.addProperty(retail);
                        }
                }
        }

        /**
         * Displays the main menu and processes user's choice
         */
        public void doSearches() {
                boolean exit = false;
                while (!exit) {
                        System.out.println("Welcome to our Property search. Choose one of the following options:");
                        System.out.println("1. General Queries");
                        System.out.println("2. Residence Queries");
                        System.out.println("3. Commercial Queries");
                        System.out.println("4. Retail Queries");
                        System.out.println("5. Exit");
                        System.out.print("Enter your choice: ");
                        int choice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character

                        switch (choice) {
                                case 1:
                                        doGeneralQueries();
                                        break;
                                case 2:
                                        doResidenceQueries();
                                        break;
                                case 3:
                                        doCommercialQueries();
                                        break;
                                case 4:
                                        doRetailQueries();
                                        break;
                                case 5:
                                        exit = true;
                                        System.out.println("\nGoodbye for now!");
                                        break;
                                default:
                                        System.out.println("Invalid choice. Please try again.");
                        }
                }
        }

        /**
         * Handles general property queries
         */
        private void doGeneralQueries() {
                boolean back = false;
                while (!back) {
                        System.out.println("\nGeneral Queries:");
                        System.out.println("1. By Property ID");
                        System.out.println("2. By Price");
                        System.out.println("3. By Street");
                        System.out.println("4. By Type");
                        System.out.println("5. Back");
                        System.out.print("Enter your choice: ");
                        int choice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character

                        switch (choice) {
                                case 1:
                                        System.out.print("Enter Property ID: ");
                                        String propertyId = scanner.nextLine();
                                        Property property = agency.getProperty(propertyId);
                                        if (property != null) {
                                                System.out.println(property);
                                        } else {
                                                System.out.println("Property not found.");
                                        }
                                        break;
                                case 2:
                                        System.out.print("Enter minimum price (USD): ");
                                        double minPrice = scanner.nextDouble();
                                        System.out.print("Enter maximum price (USD): ");
                                        double maxPrice = scanner.nextDouble();
                                        ArrayList<Property> propertiesInRange = agency.getPropertiesBetween(minPrice,
                                                        maxPrice);
                                        if (propertiesInRange != null) {
                                                for (Property prop : propertiesInRange) {
                                                        System.out.println(prop);
                                                }
                                        } else {
                                                System.out.println("No properties found in the specified price range.");
                                        }
                                        break;
                                case 3:
                                        System.out.print("Enter street name: ");
                                        String streetName = scanner.nextLine();
                                        ArrayList<Address> propertiesOnStreet = agency.getPropertiesOn(streetName);
                                        if (propertiesOnStreet != null) {
                                                for (Address addr : propertiesOnStreet) {
                                                        System.out.println(addr);
                                                }
                                        } else {
                                                System.out.println("No properties found on the specified street.");
                                        }
                                        break;
                                /// gerehehethhhhhhhhhhhhhhht
                                case 4:
                                        System.out.print("Enter property type (residence, commercial, retail): ");
                                        String propertyType = scanner.nextLine();
                                        ArrayList<Property> propertiesOfType = agency.getPropertiesOfType(propertyType);
                                        if (propertiesOfType != null) {
                                                for (Property prop : propertiesOfType) {
                                                        System.out.println(prop);
                                                }
                                        } else {
                                                System.out.println("No properties found of the specified type.");
                                        }
                                        break;
                                case 5:
                                        back = true;
                                        break;
                                default:
                                        System.out.println("Invalid choice. Please try again.");
                        }
                        scanner.close();

                }
        }

        /*
         * Handles residence property queries
         * 
         */
        private void doResidenceQueries() {
                boolean back = false;
                while (!back) {
                        System.out.println("\nResidence Queries:");
                        System.out.println("1. By Bedroom");
                        System.out.println("2. By Pool");
                        System.out.println("3. By Strata");
                        System.out.println("4. Back");
                        System.out.print("Enter your choice: ");
                        int choice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character

                        switch (choice) {
                                case 1:
                                        System.out.print("Enter minimum number of bedrooms: ");
                                        int minBedrooms = scanner.nextInt();
                                        System.out.print("Enter maximum number of bedrooms: ");
                                        int maxBedrooms = scanner.nextInt();
                                        HashMap<String, Residence> propertiesWithBedrooms = agency
                                                        .getPropertiesWithBedrooms(minBedrooms, maxBedrooms);
                                        if (propertiesWithBedrooms != null) {
                                                for (Residence residence : propertiesWithBedrooms.values()) {
                                                        System.out.println(residence);
                                                }
                                        } else {
                                                System.out.println(
                                                                "No residences found in the specified bedroom range.");
                                        }
                                        break;
                                case 2:
                                        ArrayList<Residence> propertiesWithPools = agency.getPropertiesWithPools();
                                        if (!propertiesWithPools.isEmpty()) {
                                                for (Residence residence : propertiesWithPools) {
                                                        System.out.println(residence);
                                                }
                                        } else {
                                                System.out.println("No residences found with swimming pools.");
                                        }
                                        break;
                                case 3:
                                        ArrayList<Residence> propertiesWithStrata = agency.getPropertiesWithStrata();
                                        if (!propertiesWithStrata.isEmpty()) {
                                                for (Residence residence : propertiesWithStrata) {
                                                        System.out.println(residence);
                                                }
                                        } else {
                                                System.out.println("No residences found in a strata.");
                                        }
                                        break;
                                case 4:
                                        back = true;
                                        break;
                                default:
                                        System.out.println("Invalid choice. Please try again.");
                        }
                }
        }

        /*
         * Handles commercial property queries
         */
        private void doCommercialQueries() {
                boolean back = false;
                while (!back) {
                        System.out.println("\nCommercial Queries:");
                        System.out.println("1. By Loading Dock");
                        System.out.println("2. By Highway Access");
                        System.out.println("3. Back");
                        System.out.print("Enter your choice: ");
                        int choice = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character

                        switch (choice) {
                                case 1:
                                        ArrayList<Commercial> propertiesWithLoadingDock = agency
                                                        .getPropertiesWithLoadingDock();
                                        if (!propertiesWithLoadingDock.isEmpty()) {
                                                for (Commercial commercial : propertiesWithLoadingDock) {
                                                        System.out.println(commercial);
                                                }
                                        } else {
                                                System.out.println(
                                                                "No commercial properties found with loading docks.");
                                        }
                                        break;
                                case 2:
                                        ArrayList<Commercial> propertiesWithHighwayAccess = agency
                                                        .getPropertiesWithHighwayAccess();
                                        if (!propertiesWithHighwayAccess.isEmpty()) {
                                                for (Commercial commercial : propertiesWithHighwayAccess) {
                                                        System.out.println(commercial);
                                                }
                                        } else {
                                                System.out.println(
                                                                "No commercial properties found with highway access.");
                                        }
                                        break;
                                case 3:
                                        back = true;
                                        break;
                                default:
                                        System.out.println("Invalid choice. Please try again.");
                        }
                }
        }

        /*
         * Handles retail property queries
         */
        private void doRetailQueries() {
                boolean back = false;

                while (!back) {
                        System.out.println("Retail Queries:");
                        System.out.println("1. By Square Footage");
                        System.out.println("2. By Customer Parking");
                        System.out.println("3. Back");

                        int choice = scanner.nextInt();

                        switch (choice) {
                                case 1:
                                        System.out.println("Enter minimum square footage:");
                                        int minSquareFootage = scanner.nextInt();
                                        ArrayList<Retail> propertiesWithSquareFootage = agency
                                                        .getPropertiesWithSquareFootage(minSquareFootage);
                                        if (!propertiesWithSquareFootage.isEmpty()) {
                                                for (Retail retail : propertiesWithSquareFootage) {
                                                        System.out.println(retail);
                                                }
                                        } else {
                                                System.out.println(
                                                                "No retail properties found with the specified square footage.");
                                        }
                                        break;
                                case 2:
                                        ArrayList<Retail> propertiesWithCustomerParking = agency
                                                        .getPropertiesWithCustomerParking();
                                        if (!propertiesWithCustomerParking.isEmpty()) {
                                                for (Retail retail : propertiesWithCustomerParking) {
                                                        System.out.println(retail);
                                                }
                                        } else {
                                                System.out.println(
                                                                "No retail properties found with customer parking available.");
                                        }
                                        break;
                                case 3:
                                        back = true;
                                        break;
                                default:
                                        System.out.println("Invalid choice. Please try again.");
                        }

                }

        }

        /**
         * Main method
         *
         * @param args command line arguments
         * @throws FileNotFoundException if the files are not found
         */
        public static void main(String[] args) throws FileNotFoundException {
                Driver driver = new Driver();
                driver.init();
                driver.doSearches();

        }
}
