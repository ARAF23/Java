package Lab01b;

/*@author Wasi */

// Student class starts from here
class Student {

    // instance variable
    private Name name;
    private String studentNumber;
    private Date dateOfBirth;
    private boolean graduated;

    // Constructor
    Student(Name name, String studentNumber, Date dateOfBirth, boolean graduated) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.dateOfBirth = dateOfBirth;
        this.graduated = graduated;
    }

    // Accessor methods
    public Name getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isGraduated() {
        return graduated;
    }
}
