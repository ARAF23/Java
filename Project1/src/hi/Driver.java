package hi;

public class Driver {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MySubClass mySubClass = new MySubClass();
        System.out.println("in main:");
        System.out.println("myClass.number = " + myClass.getNumber());
        System.out.println("mySubClass.value = " + mySubClass.getValue());
    }
}
