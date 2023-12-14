package interviewQ.StringBuffer_Programs;

import java.util.Scanner;

public class StringToIntegerConverter {

    static int convertStringToInteger(String userInput) {

        if (userInput == null) {
            throw new IllegalArgumentException("Input string is null");
        }
        if (userInput.trim().isEmpty()) {
            throw new IllegalArgumentException("Input string is empty");
        }


        StringBuffer stringBuffer = new StringBuffer();
        int index = 0;
        if (userInput.charAt(0) == '-') {
            index = 1;
            stringBuffer.append('-');
        }

        for (int i = index; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);
            if (Character.isDefined(ch)) stringBuffer.append(ch);
        }
        try {
            return Integer.parseInt(stringBuffer.toString());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid integer format");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string representing an integer: ");
        String userInput = scanner.next();
        try {
            System.out.println(convertStringToInteger(userInput));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
