package interviewQ.String_Programs;

import java.util.Scanner;

public class StringLengthCalculator {
    public static void main(String[] args) {
        System.out.println("Enter string to calculate length: ");
        String str = new Scanner(System.in).next();
        int count = 0;
        for(char ch : str.toCharArray()){
            count++;
        }
        System.out.println("Total characters in "+str+" is :"+count);
    }
}
