//6. **String Compression**:
// Write a Java program to perform basic string compression using the counts of repeated characters. For example, "aaabbbccc" becomes "a3b3c3".

package interviewQ.String_Programs;

public class StringCompression {
    public static void main(String[] args) {
        String input = "yashyash";
        String compressed = compressString(input);
        System.out.println("Original String: " + input);
        System.out.println("Compressed String: " + compressed);
    }

    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder compressed = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 0;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            }
        }

        compressed.append(currentChar);
        compressed.append(count);

        return compressed.toString();
    }
}


