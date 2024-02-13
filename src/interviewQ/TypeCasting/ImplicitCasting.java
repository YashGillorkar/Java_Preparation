package interviewQ.TypeCasting;

public class ImplicitCasting {
    public static void main(String[] args) {
        // Converting lower datatype to higher datatype.
        byte b = 2;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
