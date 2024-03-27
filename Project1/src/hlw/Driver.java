package hlw;

public class Driver {
    public static void main(String[] args) {
        A a = new A();
        B b1 = new B();
        C c1 = new C();
        B c2 = new C();
        A c3 = new C();

        a.display();
        b1.display();
        c1.display();
        c2.display();
        c3.display();
    }
}