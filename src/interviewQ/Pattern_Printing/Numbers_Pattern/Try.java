package interviewQ.Pattern_Printing.Numbers_Pattern;

public class Try {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println("Hi");
            else if (i % 5 == 0) {
                System.out.println("Hello");
                continue;
            } else if (i % 7 == 0) {
                System.out.println("End");
                break;
            }else
            System.out.println("Good");
        }
    }
}
