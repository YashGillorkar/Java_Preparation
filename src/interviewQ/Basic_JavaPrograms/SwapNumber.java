//5. Implement a program to swap two numbers without using a temporary variable in Java.
package interviewQ.Basic_JavaPrograms;

public class SwapNumber {
    static int a = 23;
    static int b = 32;

    public static void main(String[] args) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        // a = a+b;
        // b = a-b;
        // a = a-b;

        System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}
