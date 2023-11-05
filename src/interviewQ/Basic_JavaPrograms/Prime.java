//2. Implement a Java program to check if a given number is prime.
package interviewQ.Basic_JavaPrograms;

import java.util.Scanner;

public class Prime {

    public static boolean isPrime(int number) {
        if (number < 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number :- ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }


}
