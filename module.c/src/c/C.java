package c;

// import a.A; has no effect because module.a does not export a to module.c
import b.B;

public class C {
    private int c;

// has no effect because module.a does not export a (with class A) to module.c
//    void doIt(A a) {
//        int myVar = a.a;
//    }

    void doIt(B b) {
        int myVar = b.b;
    }
}
