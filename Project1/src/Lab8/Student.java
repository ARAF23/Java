package Lab8;
/*
 * Wasi omar bin bayzed
 * 
 */

//Student.java

public class Student {
    private String firstName;
    private String lastName;
    private String idNumber;
    private int yearOfBirth;
    private double grade;
    private boolean pass;
    // Constants for grade thresholds
    public static final double PASS_THRESHOLD = 60.0;
    public static final double MAX_GRADE = 100.0;
    public static final double MIN_GRADE = 0.0;
    public static final int CURRENT_YEAR = 2024;
    public static final int INVALID_YEAR_OF_BIRTH = 0;

    public Student(String firstName, String lastName, String idNumber, int yearOfBirth, double grade) {
        validateInput(firstName, lastName, idNumber, yearOfBirth, grade);
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.yearOfBirth = yearOfBirth;
        this.grade = grade;
        this.pass = (grade >= PASS_THRESHOLD);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        if (idNumber != null && !idNumber.isEmpty()) {
            this.idNumber = idNumber;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > INVALID_YEAR_OF_BIRTH) {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= MIN_GRADE && grade <= MAX_GRADE) {
            this.grade = grade;
            this.pass = (grade >= PASS_THRESHOLD);
        }
    }

    public boolean isPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", idNumber=" + idNumber +
                ", age=" + (CURRENT_YEAR - yearOfBirth) + ", grade=" + grade + ", pass=" + pass + "]";
    }

    private void validateInput(String firstName, String lastName, String idNumber, int yearOfBirth, double grade) {
        if (firstName == null || lastName == null || idNumber == null || yearOfBirth <= INVALID_YEAR_OF_BIRTH
                || grade < MIN_GRADE
                || grade > MAX_GRADE) {
            throw new IllegalArgumentException("Invalid input parameters for creating a Student.");
        }
    }
}
