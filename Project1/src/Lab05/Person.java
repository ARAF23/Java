package Lab05;

/* Wasi Omar Bin Bayzed */

public class Person {

    public static final int CURRENT_YEAR = 2024;

    // instance variables
    private String firstName;
    private String lastName;
    private int birthYear;
    private String married;
    private double weightLb;
    private String educationLevel;

    // first constructor
    public Person(String firstName, String lastName, int birthYear, String married, double weightLb,
            String educationLevel) {
        if (!isValidEducationLevel(educationLevel)) {
            throw new IllegalArgumentException("Invalid education level");
        }
        if (!isValidMarriageStatus(married)) {
            throw new IllegalArgumentException("Invalid marriage status");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.married = married;
        this.weightLb = weightLb;
        this.educationLevel = educationLevel;
    }

    // second constructor
    public Person(String firstName, String lastName, String married, double weightLb, String educationLevel) {
        if (!isValidEducationLevel(educationLevel)) {
            throw new IllegalArgumentException("Invalid education level");
        }
        if (!isValidMarriageStatus(married)) {
            throw new IllegalArgumentException("Invalid marriage status");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = CURRENT_YEAR;
        this.married = married;
        this.weightLb = weightLb;
        this.educationLevel = educationLevel;

    }

    // third constructor
    public Person(String firstName, String lastName, double weightLb) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = CURRENT_YEAR;
        this.married = "no";
        this.weightLb = weightLb;
        this.educationLevel = "high school";
    }

    // isValidEducationLevel method
    private boolean isValidEducationLevel(String educationLevel) {
        return educationLevel.equals("high school") || educationLevel.equals("undergraduate")
                || educationLevel.equals("graduate");
    }

    // isValidMarriageStatus method
    private boolean isValidMarriageStatus(String married) {
        return married.equals("yes") || married.equals("no") || married.equals("divorced");
    }

    // getter and setter methos for the instance variables
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        if (!isValidMarriageStatus(married)) {
            throw new IllegalArgumentException("Invalid marriage status");
        }
        this.married = married;
    }

    public double getWeightLb() {
        return weightLb;
    }

    public void setWeightLb(double weightLb) {
        this.weightLb = weightLb;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        if (!isValidEducationLevel(educationLevel)) {
            throw new IllegalArgumentException("Invalid education level");
        }
        this.educationLevel = educationLevel;
    }

    // printDetails method
    public void printDetails() {
        printDetails(false, false);
    }

    public void printDetails(boolean kilograms) {
        printDetails(kilograms, false);
    }

    public void printDetails(boolean kilograms, boolean uppercase) {
        String name = uppercase ? String.format("%s %S", firstName.toUpperCase(), lastName.toUpperCase())
                : String.format("%s %s", firstName, lastName);
        String weightUnit = kilograms ? "kilograms" : "pounds";
        String weight = String.format("%.1f", kilograms ? weightLb * 0.45359237 : weightLb);
        System.out.printf("%s (%s) was born in %d, weighs %s %s, and has an %s degree!\n", name, married, birthYear,
                weight, weightUnit, educationLevel);
    }
}
