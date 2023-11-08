package interviewQ.String_Programs;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "hello world";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String without Duplicates: " + result);
    }

    public static String removeDuplicates(String input) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }

        return result.toString();
    }
}

