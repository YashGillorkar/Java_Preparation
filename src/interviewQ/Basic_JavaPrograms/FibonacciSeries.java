package interviewQ.Basic_JavaPrograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the number till which you want the Fibonacci series: ");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        int f1 = 0;
        int f2 = 1;

        if (numb <= 0) {
            System.out.println("Invalid number. Fibonacci Series is not possible for non-positive numbers.");
        } else if (numb == 1) {
            System.out.println("Fibonacci series is: " + f1);
        } else if (numb == 2) {
            System.out.println("Fibonacci series is: " + f1 + " " + f2);
        } else {
            System.out.print("Fibonacci series is: " + f1 + " " + f2);

            for (int i = 2; i < numb; i++) {
                int next = f1 + f2;
                System.out.print(" " + next);
                f1 = f2;
                f2 = next;
            }
        }
    }
}
