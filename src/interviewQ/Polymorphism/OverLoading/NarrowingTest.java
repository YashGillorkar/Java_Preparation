package interviewQ.Polymorphism.OverLoading;

public class NarrowingTest {
    public static void main(String[] args) {
        NarrowingA a = new NarrowingA();
        a.m1(null);
        // According narrowing concept child class parameters well get called
        // so here object is parent and String class is child
    }
}
