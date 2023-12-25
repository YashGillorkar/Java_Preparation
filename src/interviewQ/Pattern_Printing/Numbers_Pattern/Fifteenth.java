package interviewQ.Pattern_Printing.Numbers_Pattern;

public class Fifteenth {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            // Use i%2 to alternate between starting with 0 and 1
            int startValue = (i % 2 == 0) ? 1 : 0;

            for (int j = 0; j < 6; j++) {
                // Use XOR to alternate between 0 and 1
                System.out.print((startValue + j) % 2);
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
