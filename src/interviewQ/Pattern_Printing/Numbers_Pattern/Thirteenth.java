/*
1
12
123
1234
12345
1234
123
12
1
 */

package interviewQ.Pattern_Printing.Numbers_Pattern;

import java.util.Scanner;

public class Thirteenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();
        // Single loop for both ascending and descending order
        for (int i = 1; i <= 2 * n - 1; i++) {
            int maxJ = (i <= n) ? i : 2 * n - i;

            for (int j = 1; j <= maxJ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
