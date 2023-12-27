package interviewQ.Inheritance_Cases;

public class Case_3 extends B {
    public static void main(String[] args) {
        //The method or behavior execution is determined at runtime based on the actual type of the object that the reference variable points to.
        //If the subclass (B in this case) has overridden a method present in the superclass (A), the overridden method in the subclass is executed. This is known as method overriding.
        A b = new B();
        System.out.println(b.x);
        System.out.println(b.y);//12
        //System.out.println(b.z);
        b.m1();
        b.m2();//B_m2
        //b.m3();
    }
}

