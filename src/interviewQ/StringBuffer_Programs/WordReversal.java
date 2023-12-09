package interviewQ.StringBuffer_Programs;

import java.util.Scanner;

public class WordReversal {

    void reverse(String input) {
        String[] arr = input.split("\\s+");
        //Used split("\\s+") instead of split(" ") to handle multiple spaces between words.
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = arr.length - 1; i >= 0; i--) {
            stringBuffer.append(arr[i]);
            //Added a check if (i > 0) to append a space only if there are more words to be appended.
            if (i > 0) {
                stringBuffer.append(" ");
            }
        }
        System.out.println(stringBuffer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to reverse the words: ");
        String input = scanner.nextLine();
        new WordReversal().reverse(input);
        scanner.close();
    }
}
