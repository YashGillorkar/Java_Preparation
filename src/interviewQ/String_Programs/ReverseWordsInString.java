//9. **String Reversal in Words**:
// Develop a Java program to reverse the words in a given string while maintaining the word order.

package interviewQ.String_Programs;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String originalString = " I have bachelor degree in computer science";
        String reverseString = "";
        String arr[] = originalString.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseString = reverseString + " " + arr[i];
        }
        System.out.println(reverseString);

    }
}
