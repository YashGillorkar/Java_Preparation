package interviewQ.Inheritance_Cases;

public class Case_7 {
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        b = a; // A b = new A();---> Case_1
        System.out.println(b.x);
        System.out.println(b.y);
        //System.out.println(b.z); error
        b.m1();
        b.m2();// A_m2
        //b.m3(); error
    }
}
