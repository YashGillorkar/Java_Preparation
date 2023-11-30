package interviewQ.String_Programs;

import java.util.Scanner;

public class RemoveWhitespace {

    private static String removeWhitespace(String input){
        return input.replaceAll("\\s", "");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter and sentence to remove whitespace");
        String userInput = scanner.nextLine();
        System.out.println("Original String: "+userInput);
        System.out.println(" String without Whitespace: "+(removeWhitespace(userInput)));
        scanner.close();
    }
}
