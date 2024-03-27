package Lab01b;

/*@author Wasi */

//date class starts from here
class Date {

    // instance varibale of the class
    private int year;
    private int month;
    private int day;

    // constructor
    Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Method : getYyMmDd
    public String getYyMmDd() {
        return year + "-" + month + "-" + day;
    }

    // Accessor methods
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // mutator methods
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
