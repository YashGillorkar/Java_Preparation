package interviewQ.Character_Class_Programs;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyAnalysis {
    public static void main(String[] args) {
        String inputString = "Hello, World!";

        // Remove spaces and convert to lowercase for case-insensitive analysis
        inputString = inputString.replaceAll("\\s", "").toLowerCase();

        // Create a map to store character frequencies
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Analyze the frequency of each character
        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) { // Only analyze letters, you can modify this condition as needed
                charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Display the character frequencies
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
