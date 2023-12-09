//Replace all occurrences of the letter 'a' with 'x'.

package interviewQ.StringBuffer_Programs;

import java.util.Scanner;

public class ReplaceLetters {

    static void replaceLetters(String input) {
        StringBuffer stringBuffer = new StringBuffer(input);
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i) == 'a')
                stringBuffer.setCharAt(i, 'x');
        }
        System.out.println(stringBuffer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence to replaced all the occurrences of 'a' to 'x':");
        String userInput = scanner.nextLine();
        scanner.close();
        replaceLetters(userInput);
    }
}
