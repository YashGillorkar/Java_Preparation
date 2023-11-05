// Write a Java program that converts a given character to its ASCII value and vice versa using the `Character` class.

package interviewQ.Character_Class_Programs;

public class CharacterToASCII {
    public static void main(String[] args) {
        char character = 'A';
        int asciiValue = (int)character;
        System.out.println("ASCII value of "+character+" is : "+asciiValue);
        int asciiValueToConvert = 66;
        char convertedCharacter = (char) asciiValueToConvert;
        System.out.println("Character for ASCII value "+asciiValueToConvert+" is :"+convertedCharacter);
    }
}
