package Lab01b;

/*@author Wasi */

//main class starts form here
public class Main {

    public static void main(String[] args) {

        // Creating Date objects
        Date twDob = new Date(1975, 12, 30);
        Date bgDob = new Date(1955, 10, 28);

        // Creating Name objects
        Name twName = new Name("Tiger", "Woods");
        Name bgName = new Name("Bill", "Gates");

        // Creating Student objects
        Student tw = new Student(twName, "A00123456", twDob, true);
        Student bg = new Student(bgName, "A00987654", bgDob, false);

        // Printing student information
        System.out.print(tw.getName().getFullName() + " (" + tw.getName().getInitials() +
                ") (st # " + tw.getStudentNumber() + ") was born on " + tw.getDateOfBirth().getYyMmDd());

        // Condition checking for graduation
        if (tw.isGraduated() == true) {
            System.out.println(". The student has graduated");
        } else {
            System.out.println(". The student has not graduated");
        }

        System.out.print(bg.getName().getFullName() + " (" + bg.getName().getInitials() +
                ") (st # " + bg.getStudentNumber() + ") was born on " + bg.getDateOfBirth().getYyMmDd());

        // Condition checking for graduation

        if (bg.isGraduated() == true) {
            System.out.println(". The student has graduated");
        } else {
            System.out.println(". The student has not graduated");
        }
    }
}