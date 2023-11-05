//1. Write a Java program to find the factorial of a number.
package interviewQ.Basic_JavaPrograms;

import java.util.Scanner;

public class Factorial {

    public static void calculateFactorial(int factInput){
        long result = 1;
        if(factInput<0)
            System.out.println("Factorial is not defined for negative numbers");
        else if(factInput == 0  || factInput == 1)
            System.out.println("The factorial of " + factInput + " is: " + factInput);
        else

        for (int i = 2; i <= factInput; i++) {
            result *= i;
        }
        System.out.println("The factorial of " + factInput + " is: " + result);

    }
    public static void main(String[] args) {
        System.out.println("Enter the number to find factorial :- ");
        Scanner scanner = new Scanner(System.in);
        int factInput = scanner.nextInt();
        calculateFactorial(factInput);
    }
}
