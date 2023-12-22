/*
    1
   11
  111
 1111
11111

sum pattern printing
 */

package interviewQ.Pattern_Printing.Numbers_Pattern;
public class Fourth {

    public static void main(String[] args) {
        for (int i =1; i<=5; i++){
            for(int k = 1; k<=5-i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
