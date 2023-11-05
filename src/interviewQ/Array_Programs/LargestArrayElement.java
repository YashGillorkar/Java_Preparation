//7. Write a Java program to find the largest element in an array.
package interviewQ.Array_Programs;

import java.util.Scanner;

public class LargestArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter " + length + " array elements to find the largest element: ");

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        int largest = arr[0];
        for (int i = 1; i < length; i++) {
            if(arr[i]>largest)
                largest = arr[i];
        }
        System.out.println("Largest Element in the array is :- "+largest);
    }
}
