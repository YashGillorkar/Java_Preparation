//4. **Character Count**:
//   - Write a Java program that counts the occurrences of a specific character in a given string using `Character` class methods.

package interviewQ.Character_Class_Programs;

import java.util.Scanner;

public class OccurrencesOfCharacter {

    static int countCharacterOccurrences(String word , char targetChar){
        int count =0;
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i)==targetChar)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String inputWord = scanner.next();
        System.out.println("Enter the Character do you want to count: ");
        char targetChar = scanner.next().charAt(0);
        int count = countCharacterOccurrences(inputWord,targetChar);
        System.out.println("Occurrences of character "+targetChar+" in "+inputWord+" is: "+count);
    }
}
