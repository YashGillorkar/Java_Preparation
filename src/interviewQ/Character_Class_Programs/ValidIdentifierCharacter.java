//3. **Character Validation**:
//   - Create a Java program to validate if a character is a valid Java identifier part character (e.g., for variable names) using `Character` class methods.

package interviewQ.Character_Class_Programs;

import java.util.Scanner;

public class ValidIdentifierCharacter {

    static void checkIdentifier(char input) {
        if (Character.isLetter(input) || Character.isDigit(input) || input == '_' || Character.getType(input) == Character.CURRENCY_SYMBOL)
            System.out.println(input + " is a valid Java identifier part character.");
        else
            System.out.println(input + " is not a valid Java identifier part character.");
    }

    public static void main(String[] args) {
        System.out.println("Enter character: ");
        Scanner scanner = new Scanner(System.in);
        String userStirng = scanner.nextLine();
        char userChar = 'a';
        if (userStirng.length() == 1) {
            userChar = userStirng.charAt(0);
            checkIdentifier(userChar);
        } else
            System.out.println("Please enter Single character ");
    }
}
