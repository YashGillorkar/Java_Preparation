/*
123
 45
  6

 */

package interviewQ.Pattern_Printing.Numbers_Pattern;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows you want to print Inverted RightAngle Triangle");
        int rows = scanner.nextInt();
        int count =1;
        for (int i = rows; i>=1; i--){
            for (int k = 1; k<=rows-i; k++){
                System.out.print(" ");
            }
            for( int j =1; j<=i; j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
