package interviewQ.StringBuffer_Programs;

import java.util.Scanner;

public class ReverseString {

    void reverseSentence(String input) {

        if (input == null) {
            System.out.println("Input is null. Cannot reverse.");
            return;
        }

        System.out.println("Original Sentence :-");
        System.out.println(input);
        System.out.println("Reversed Sentence :-");

        StringBuffer stringBuffer = new StringBuffer(input);
        System.out.println(stringBuffer.reverse());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence to reverse the entire sentence:");
        String userInput = scanner.nextLine();
        new ReverseString().reverseSentence(userInput);
    }
}
