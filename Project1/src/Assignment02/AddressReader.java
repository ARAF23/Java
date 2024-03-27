package Assignment02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressReader {
    /**
     * Reads address data from a file and creates Address objects.
     * 
     * @author wasi omar bin bayzed
     * @param file The file containing the address data.
     * @return An ArrayList containing Address objects.
     * @throws FileNotFoundException if the specified file is not found.
     */
    public static ArrayList<Address> readAddressData(File file) throws FileNotFoundException {
        ArrayList<Address> addresses = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\|");

                // Handle missing unit number
                String unitNumber = parts[0].trim();
                // String unitNumber = parts[0].trim().isEmpty() ? null : parts[0].trim();
                int streetNumber = Integer.parseInt(parts[1].trim());
                String streetName = parts[2].trim();
                String postalCode = parts[3].trim();
                String city = parts[4].trim();

                Address address = new Address(unitNumber, streetNumber, streetName, postalCode, city);
                addresses.add(address);
            }
        }

        return addresses;
    }

}
