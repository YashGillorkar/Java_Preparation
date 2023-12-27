package interviewQ.Inheritance_Cases;

public class Case_4 {
    public static void main(String[] args) {
        //B b =  new A();--A is parent class it cannot be store in child class reference variable of sub-class(B)
        B b = (B) new A();// so we have to type casting is required.
        // case_4 is not possible.
    }
}
