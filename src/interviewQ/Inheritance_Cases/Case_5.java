package interviewQ.Inheritance_Cases;

public class Case_5 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a =b; // it wil become case 3 A a = new B ();
        System.out.println(a.x);
        System.out.println(a.y);//12
        //System.out.println(a.z);
        a.m1();
        a.m2();//B_m2
        //a.m3();
    }
}
