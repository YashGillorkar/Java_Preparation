/*
3. Print an invert right-angled triangle of stars.
    *
   **
  ***
 ****
*****
 */

package interviewQ.Pattern_Printing.Asterisk_Pattern.Right_AngleTriangle;

import java.util.Scanner;

public class InvertedRightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows you want to print Inverted RightAngle Triangle");
        int rows = scanner.nextInt();
        for (int i = 1; i<=rows; i++){
            for (int k = 1; k<=rows-i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
