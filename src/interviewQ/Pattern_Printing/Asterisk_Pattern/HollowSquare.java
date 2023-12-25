/*
6. Print a hollow square pattern of stars.
   ```
   *****
   *   *
   *   *
   *   *
   *****
 */

package interviewQ.Pattern_Printing.Asterisk_Pattern;
public class HollowSquare {
    public static void main(String[] args) {
        int rows =5;
        for (int i = 1; i<=rows ; i++){
            for (int j = 1; j<=rows; j++){
                if(i==1||i==5||j==1||j==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
