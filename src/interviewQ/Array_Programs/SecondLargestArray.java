package interviewQ.Array_Programs;

import java.util.Scanner;

public class SecondLargestArray {

    int[] findLargestArray(int arr[]) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        System.out.println("Largest Element in the array is :- " + largest);
        int[] second = new int[arr.length - 1];
        for (int i = 0; i < second.length; i++) {
            if (arr[i] != largest)
                second[i] = arr[i];
        }
        return second;
    }

    void findSecondLargestArray(int arr[]) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        System.out.println("Second largest Element in the array is :- " + largest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter " + length + " array elements to find the largest element: ");

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        SecondLargestArray secondLargestArray = new SecondLargestArray();
        int[] second = secondLargestArray.findLargestArray(arr);
        secondLargestArray.findSecondLargestArray(second);

    }
}
