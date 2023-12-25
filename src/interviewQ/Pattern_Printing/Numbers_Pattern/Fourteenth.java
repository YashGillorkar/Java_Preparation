/*
54321
5432
543
54
5

 */

package interviewQ.Pattern_Printing.Numbers_Pattern;

public class Fourteenth {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            for (int j = 5; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
       /*Another Way
            for(int i = 5; i>=1; i--){
              for (int j = 5; j>(5-i); j--){
                 System.out.print(j);
             }
            System.out.println();
        }
        */
    }
}
