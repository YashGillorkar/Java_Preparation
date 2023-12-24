/*
3. Print an inverted right-angled triangle of stars.
   *****
   ****
   ***
   **
   *
 */

package interviewQ.Pattern_Printing.Asterisk_Pattern.Right_AngleTriangle;

public class InvertedRightAngledTriangle {

    public static void main(String[] args) {
        for(int i = 1 ; i<=5 ; i++){
            for(int j= 5; j>=i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
