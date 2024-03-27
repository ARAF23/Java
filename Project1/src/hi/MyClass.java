package hi;

public class MyClass {
    private int number;

    public MyClass() {
        System.out.println("The constructor of MyClass");
        number = 100;
        System.out.println("number = " + number);
        number = 345;
        System.out.println("number = " + number);
    }

    public void setNumber(int value) {
        this.number = value;
    }

    public int getNumber() {
        return number;
    }
}
