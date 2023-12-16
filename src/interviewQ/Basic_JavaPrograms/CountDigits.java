package interviewQ.Basic_JavaPrograms;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        System.out.println("Enter number to count digit in it: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int Originalnumber = number;
        int digit = 0;
        while (number>0){
            number = number/10;
            digit++;
        }
        System.out.println("No of digits in "+Originalnumber+" is "+digit);
        scanner.close();
    }
}
