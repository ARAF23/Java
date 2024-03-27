package Assignment02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PropertyReader {
    /**
     * Reads property data from a file and adds each line to an ArrayList.
     * 
     * @author Wasi omar bin bayzed
     * @param file The file containing the property data.
     * @return An ArrayList containing strings for each line in the file.
     * @throws FileNotFoundException if the specified file is not found.
     */
    public static ArrayList<String> readPropertyData(File file) throws FileNotFoundException {
        ArrayList<String> propertyData = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                propertyData.add(line);
            }
        }

        return propertyData;
    }
}
