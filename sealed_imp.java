sealed interface I permits A, B, C {
    void count();
}

class D {

    void display() {
        System.out.println("Class D");
    }
}

sealed class A extends D implements I permits B, C {

    @Override
    public void count() {
        System.out.println("Count method from A");
    }

    void dis() {
        System.out.println("Class A");
    }
}

non-sealed class B extends A implements I {

    void show() {
        System.out.println("Class B");
    }
    //  public void count() {
    //     System.out.println("Count method from B");
    // }
}

final class C extends A implements I {

    void print() {
        System.out.println("Class C");
        
    }
    //  public void count() {
    //     System.out.println("Count method from c");
    // }
}

public class sealed_imp {

    public static void main(String[] args) {

        B obj = new B();

        obj.display();   // from D
        obj.dis();       // from A
        obj.show();      // from B
        obj.count();     // from Interface I (implemented in A)

        System.out.println();

        C obj2 = new C();

        obj2.display();  // from D
        obj2.dis();      // from A
        obj2.print();    // from C
        obj2.count();    // from Interface I (implemented in A)
    }
}