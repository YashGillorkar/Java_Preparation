/*
4. Print a pyramid of stars.
   ```
      *
     * *
    * * *
   * * * *
  * * * * *
 */

package interviewQ.Pattern_Printing.Asterisk_Pattern;

public class Pyramid_1 {
    public static void main(String[] args) {
        for (int i =1; i<=5; i++){
            for(int k = 1; k<=5-i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
