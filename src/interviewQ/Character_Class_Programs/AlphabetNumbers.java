// Write a program that print Alphabets both capital and small and number
package interviewQ.Character_Class_Programs;

public class AlphabetNumbers {
    public static void main(String[] args) {
        System.out.println("Here are Numbers:");
        for (char i = '0'; i <= '9'; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nHere are the Capital Alphabets:");
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nHere are the Small Alphabets:");
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
    }
}
