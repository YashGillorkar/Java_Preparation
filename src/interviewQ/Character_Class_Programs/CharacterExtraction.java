//**Character Extraction**:
//-Write a Java program to extract all the digits from a given string and compute their sum using `Character` class methods.

package interviewQ.Character_Class_Programs;

public class CharacterExtraction {
    public static void main(String[] args) {
        String input = "Y4a5s8h5";
        int sum = 0;
        for (int i = 0; i <= input.length()-1; i++) {
            if (Character.isDigit(input.charAt(i)))
                sum = sum + Character.getNumericValue(input.charAt(i));
        }
        System.out.println("Sum of the digits in the string is: "+sum);
    }
}
