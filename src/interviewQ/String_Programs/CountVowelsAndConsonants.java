//3. **Count Vowels and Consonants**:
// Create a Java program to count the number of vowels and consonants in a given string.

package interviewQ.String_Programs;

import java.util.Scanner;

public class CountVowelsAndConsonants {

    static void findVowelsAndConsonants(String word) {
        int countVowels = 0;
        int countConsonants = 0;
        int wordLength = word.length();

        for (int i = 0; i < wordLength; i++) {
            char alphabet = Character.toLowerCase(word.charAt(i));
            if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
                countVowels++;
            } else if (Character.isLetter(alphabet)) {
                countConsonants++;
            }
        }

        System.out.println("Total numbers of vowels in " + word + " is: " + countVowels);
        System.out.println("Total numbers of consonants in " + word + " is: " + countConsonants);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to find vowels and consonants in it: ");
        String word = scanner.nextLine();
        scanner.close();
        findVowelsAndConsonants(word);
    }
}
