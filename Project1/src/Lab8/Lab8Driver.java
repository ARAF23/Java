package Lab8;

/*
 * Wasi omar bin bayzed
 */
// Lab8Driver.java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Lab8Driver {
    private HashMap<String, Student> students;

    public Lab8Driver() {
        this.students = new HashMap<>();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Lab8Driver driver = new Lab8Driver();

        System.out.println("DEBUG: calling readFromPrompt");
        driver.readFromPrompt();

        System.out.println("DEBUG: calling readFromFile");
        driver.readFromFile();

        System.out.println("List of Students created");
        driver.showStudents();
    }

    public void readFromPrompt() {
        Scanner scanner = new Scanner(System.in);
        boolean proceed = true;

        do {
            System.out.println("Do you wish to create a Student? (y/n): ");
            String choice = scanner.next().toLowerCase();

            if (choice.equals("y")) {
                System.out.println("Enter first name: ");
                String firstName = scanner.next();

                System.out.println("Enter last name: ");
                String lastName = scanner.next();

                System.out.println("Enter id number: ");
                String idNumber = scanner.next();

                System.out.println("Enter year of birth as a whole number: ");
                int yearOfBirth = scanner.nextInt();

                System.out.println("Enter grade in percentage as a decimal number: ");
                double grade = scanner.nextDouble();

                try {
                    Student student = new Student(firstName, lastName, idNumber, yearOfBirth, grade);
                    students.put(idNumber, student);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid input. Student not created.");
                }

            } else {
                proceed = false;
            }
        } while (proceed);

        scanner.close();
        System.out.println("Data entry finished!");
    }
    /*
     * readFromFile()
     */

    public void readFromFile() throws FileNotFoundException {

        /*
         * I had to use the absolute path to get the access of the file
         * Otherwise it shows file not found
         */
        File file = new File("student_data.txt");
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] data = line.split("\\|");

            if (data.length == 5) {
                String firstName = data[0];
                String lastName = data[1];
                String idNumber = data[2];
                int yearOfBirth = Integer.parseInt(data[3]);
                double grade = Double.parseDouble(data[4]);

                try {
                    Student student = new Student(firstName, lastName, idNumber, yearOfBirth, grade);
                    students.put(idNumber, student);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid input from file. Student not created.");
                }
            } else {
                System.out.println("Invalid data format in the file. Skipping line.");
            }
        }

        fileScanner.close();
    }

    public void showStudents() {
        for (Student student : students.values()) {
            System.out.println(student.toString());
        }
    }
}
