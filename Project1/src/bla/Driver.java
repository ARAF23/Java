package bla;

public class Driver {
    public static void main(String[] args) {
        Animal a = new Bird();
        a.eat();
        if (a instanceof Bird) {
            ((Bird) a).fly();
        }
    }
}
