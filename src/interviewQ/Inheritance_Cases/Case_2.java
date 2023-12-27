package interviewQ.Inheritance_Cases;

public class Case_2 extends B {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.x);
        System.out.println(b.y);
        System.out.println(b.z);
        b.m1();
        b.m2();//B_m2
        b.m3();
        // Child class can assess parent class method and variable
        // In case of same method or variable name in both classes the Child class has more priority than parent class
    }
}
