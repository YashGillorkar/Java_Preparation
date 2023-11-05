//3. Create a Java program to reverse a string without using built-in reverse functions.
package interviewQ.String_Programs;

import java.util.Scanner;

public class ReverseString {

    public static void doReverse(String input){
        String revString = "";
        for(int i = input.length()-1; i>=0; i--){
            revString = revString + input.charAt(i);
        }
        System.out.println("Reversed String: " + revString);
    }
    public static void main(String[] args) {
        System.out.println("Enter a String :- ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        doReverse(input);
    }
}
