/*
4. Print a pyramid of stars.
   ```
      *
     ***
    *****
   *******
  *********
 */


package interviewQ.Pattern_Printing.Asterisk_Pattern;
public class Pyramid_2 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= rows - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
