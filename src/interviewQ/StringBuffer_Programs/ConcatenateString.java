package interviewQ.StringBuffer_Programs;

import java.util.Scanner;

public class ConcatenateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First String: ");
        String firstString = scanner.nextLine(); // Use nextLine() for reading the entire line

        System.out.println("Enter Second String: ");
        String secondString = scanner.nextLine(); // Use nextLine() for reading the entire line

        StringBuffer concatenatedString = new StringBuffer(firstString).append(secondString);

        System.out.println("Concatenated String is: " + concatenatedString);

        scanner.close();
    }
}
