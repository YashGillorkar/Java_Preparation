package interviewQ.Inheritance_Cases;

public class Case_1 extends B{
    public static void main(String[] args) {
        // static polymorphism
    // Parent class can't access child class members
        A a = new A();
        System.out.println(a.x);
        System.out.println(a.y);
        //System.out.println(a.z); error
        a.m1();
        a.m2();// A_m1
        //a.m3(); error
    }
}

