/*
2. Print a right-angled triangle of stars.
   *
   **
   ***
   ****
   *****
*/

package interviewQ.Pattern_Printing.Asterisk_Pattern;

public class RightAngledTriangle {
    public static void main(String[] args) {
        for (int i = 1; i<=4; i++){
            for (int j =1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
