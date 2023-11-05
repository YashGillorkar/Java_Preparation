//2. **Character Case Handling**:
//- Implement a Java program to toggle the case (uppercase to lowercase and vice versa) of a character using `Character` class methods.
package interviewQ.Character_Class_Programs;

import java.util.Scanner;

public class CharacterCaseToggle {
    public static void main(String[] args) {
        System.out.println("Enter any character to toggle its case: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (userInput.length() == 1) {
            char inputChar = userInput.charAt(0);
            char toggledChar;

            if (Character.isUpperCase(inputChar)) {
                toggledChar = Character.toLowerCase(inputChar);
            } else {
                toggledChar = Character.toUpperCase(inputChar);
            }

            System.out.println("Original Character: " + inputChar);
            System.out.println("Toggled Character: " + toggledChar);
        } else {
            System.out.println("Please enter a single character.");
        }
    }
}
