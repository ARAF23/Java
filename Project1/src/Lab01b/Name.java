package Lab01b;

/*@author Wasi */

// Name class starts from here
class Name {

    // Instance variable
    private String first;
    private String last;

    // Constructor
    Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    // Method : getFullName
    public String getFullName() {
        return first + " " + last;
    }

    // Method : getInitials
    public String getInitials() {
        return first.toUpperCase().charAt(0) + "." + last.toUpperCase().charAt(0) + ".";
    }

    // Accessor methods
    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    // Mutator methods
    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
