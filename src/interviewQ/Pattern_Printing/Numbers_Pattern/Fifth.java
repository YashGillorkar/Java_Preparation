/*
    1
   23
  456
 78910
1112131415

sum pattern printing
 */

package interviewQ.Pattern_Printing.Numbers_Pattern;
public class Fifth {

    public static void main(String[] args) {
        int count =1;
        for(int i = 1; i<=5; i++){
            for(int k = 1; k<=5-i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
