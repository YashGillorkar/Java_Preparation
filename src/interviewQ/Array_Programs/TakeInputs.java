package interviewQ.Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class TakeInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many elements you want to store in the array:");
        int length = scanner.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter " + length + " elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("The array is: " + Arrays.toString(arr));

        // Close the Scanner to free up resources
        scanner.close();
    }
}
