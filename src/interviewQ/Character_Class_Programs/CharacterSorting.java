//Character Sorting**:
//- Implement a Java program that sorts an array of characters in alphabetical order (considering case-insensitive sorting) using `Character` class methods.

package interviewQ.Character_Class_Programs;

import java.util.Arrays;

public class CharacterSorting {
    public static void main(String[] args) {

        char[] charArray = {'b', 'C', 'A', 'd', 'E'};
        System.out.println("Unsorted characters: " + Arrays.toString(charArray));
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = Character.toLowerCase(charArray[i]);
        }
        // Sort the array in alphabetical order (case-sensitive) no need of converting to upper or lower case
        // Arrays.sort(charArray);  the order will be [numbers, upper-case, lower-case]

        Arrays.sort(charArray);
        System.out.println("Sorted characters: " + Arrays.toString(charArray));

    }
}

