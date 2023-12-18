/*
1. Print a square pattern of stars.

    *****
    *****
    *****
    *****
    *****
*/

package interviewQ.Pattern_Printing.Asterisk_Pattern;

public class SquarePattern {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
