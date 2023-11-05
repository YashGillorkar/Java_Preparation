//9. Create a program to check if a string is a palindrome in Java.
package interviewQ.String_Programs;

import java.util.Scanner;

public class Palindrome {

    Boolean checkPalindrome(String input){
        String revInput = "";
        for(int i=input.length()-1;i>=0; i--){
            revInput = revInput + input.charAt(i);
        }
        return input.equals(revInput);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to verify it is palindrome or not :- ");
        String input = scanner.next();
        boolean result = new Palindrome().checkPalindrome(input);
        if(result)
            System.out.println(input+" is Palindrome");
        else
            System.out.println(input+" is NOT Palindrome");
    }
}
