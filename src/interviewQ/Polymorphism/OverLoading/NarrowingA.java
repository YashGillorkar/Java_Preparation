package interviewQ.Polymorphism.OverLoading;

public class NarrowingA {

    public void m1(Object o){
        System.out.println("M1--Object");
    }
    public void m1(String s ){
        System.out.println("M1--String");
    }
}
