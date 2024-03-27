package hi;

public class MySubClass extends MyClass {
    private double value;

    public MySubClass() {
        super(); // Calls the superclass (MyClass) constructor
        System.out.println("The constructor of MySubClass");
        System.out.println("value = " + value); // value is 0.0 by default for double
        value = 123.45;
        System.out.println("value = " + value);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
