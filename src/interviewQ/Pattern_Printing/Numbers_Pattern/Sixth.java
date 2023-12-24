/*
11111
 1111
  111
   11
    1

 */

package interviewQ.Pattern_Printing.Numbers_Pattern;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows you want to print Inverted RightAngle Triangle");
        int rows = scanner.nextInt();
        for (int i = rows; i>=1; i--){
            for (int k = 1; k<=rows-i; k++){
                    System.out.print(" ");
            }
            for( int j =1; j<=i; j++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
