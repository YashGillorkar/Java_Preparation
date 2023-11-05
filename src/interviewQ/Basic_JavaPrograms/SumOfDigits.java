//10. Write a Java program to calculate the sum of digits in a given number.

package interviewQ.Basic_JavaPrograms;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = 0;

        int originalNumber = number; // Store the original number to display later
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit
        }
        System.out.println("The sum of digits in " + originalNumber + " is: " + sum);
    }
}


