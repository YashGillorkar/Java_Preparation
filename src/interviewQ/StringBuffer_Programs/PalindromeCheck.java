package interviewQ.StringBuffer_Programs;

import java.util.Scanner;

public class PalindromeCheck {

    void checkPalindrome(String input) {
        String originalInput = input;
        StringBuffer stringBuffer = new StringBuffer(input);
        if (originalInput.equals(stringBuffer.reverse().toString()))
            System.out.println(originalInput + " is Palindrome");
        else
            System.out.println(originalInput + " is NOT Palindrome");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Word to check if it's Palindrome or not: ");
        String input = scanner.next();
        new PalindromeCheck().checkPalindrome(input);
        scanner.close();
    }
}
