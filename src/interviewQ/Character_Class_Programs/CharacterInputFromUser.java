package interviewQ.Character_Class_Programs;

import java.util.Scanner;

public class CharacterInputFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String userInput = scanner.nextLine();
        char userChar;

        if (userInput.length() == 1) {
            userChar = userInput.charAt(0);

            if (Character.isLetter(userChar))
                System.out.println("You have entered: " + userChar);
            else
                System.out.println("Please enter a valid character.");
        } else
            System.out.println("Please enter a single character.");
        scanner.close();
    }
}
