package quiz8;

import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;

public class NumberGuess {
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int MAX_GUESS_ATTEMPTS = 3;
    private static final String FILENAME = "D:\\Java-Basic\\Project1\\src\\quiz8\\messages.txt";

    public static void main(String[] args) {
        // Initialize Scanner and Random objects
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // Read messages from the file
        String[] messages = readMessagesFromFile();

        // Generate a random number between 1 and 20
        int randomNumber = rand.nextInt(MAX_RANDOM_NUMBER) + 1;

        // Prompt the user to enter their first and last name
        System.out.print(messages[0]);
        String fullName = scanner.nextLine();

        // Extract first and last name
        String[] names = fullName.split(" ");
        String firstName = names[0];

        // Start the guessing loop
        for (int attempts = 1; attempts <= MAX_GUESS_ATTEMPTS; attempts++) {
            // Prompt user for a guess
            int userGuess = getUserGuess(scanner, messages, attempts);

            // Check if the guess is correct
            if (userGuess == randomNumber) {
                // Display success message
                System.out.printf(messages[2], fullName, messages[3]);
                break;
            } else {
                // Display failure message
                System.out.printf("hi", messages[4], fullName, messages[5]);
            }
        }

        // Close the scanner
        scanner.close();
    }

    private static String[] readMessagesFromFile() {
        // Read messages from the file
        String[] messages = new String[6];
        try {
            Scanner fileScanner = new Scanner(new File(FILENAME));
            int index = 0;
            while (fileScanner.hasNextLine() && index < messages.length) {
                messages[index] = fileScanner.nextLine();
                index++;
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
            System.exit(1);
        }
        return messages;
    }

    private static int getUserGuess(Scanner scanner, String[] messages, int attempt) {
        int userGuess = 0;
        boolean isValidInput = false;

        // Keep prompting until a valid input is provided
        while (!isValidInput) {
            System.out.printf(messages[1], attempt);
            try {
                userGuess = Integer.parseInt(scanner.nextLine());

                // Check if the guess is within the valid range
                if (userGuess >= 1 && userGuess <= MAX_RANDOM_NUMBER) {
                    isValidInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 20.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return userGuess;
    }
}
