package interviewQ.StringBuffer_Programs;

import java.util.Scanner;

public class CountVowels {

    static void findVowel(String sentence) {
        StringBuffer stringBuffer = new StringBuffer(sentence);
        int count = 0;

        for (int a = 0; a < stringBuffer.length(); a++) {
            char currentChar = Character.toLowerCase(stringBuffer.charAt(a));

            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                count++;
            }
        }

        System.out.println("Number of Vowels are: " + count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to find vowels in it: ");
        String sentence = scanner.nextLine();
        findVowel(sentence);
        scanner.close();
    }
}
