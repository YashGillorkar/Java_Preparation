/*
 ********
  *******
   ******
    *****
     ****
      ***
       **
        *
 */

package interviewQ.Pattern_Printing.Asterisk_Pattern.Right_AngleTriangle;

import java.util.Scanner;

public class RightAngledTriangle_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of rows in a right angle triangle : ");
        int rows = scanner.nextInt();
        for (int i = rows; i>=1; i--){
            for(int k = 1; k<=rows-i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
