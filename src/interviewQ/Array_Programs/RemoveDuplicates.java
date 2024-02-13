package interviewQ.Array_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

    public int uniqueElements(int[] arr) {
        int uniqueCnt = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    uniqueCnt--;
                    break;
                }
            }
        }
        return uniqueCnt;
    }

    public int[] modifiedArray(int[] originalArray, int uniqueCnt) {
        int index = 0;
        int arr[] = new int[uniqueCnt];
        for (int i = 0; i < originalArray.length; i++) {
            boolean isDuplicate = false;
            // Check for duplicates in the new array
            for (int j = 0; j < index; j++) {
                if (originalArray[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not a duplicate, add it to the new array
            if (!isDuplicate) {
                arr[index] = originalArray[i];
                index++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements you want to store: ");
        int arrayLength = scanner.nextInt();
        int[] a = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter " + (i + 1) + " Element");
            a[i] = scanner.nextInt();
        }
        RemoveDuplicates rd = new RemoveDuplicates();
        int uniqueCnt = rd.uniqueElements(a);
        int[] arr = rd.modifiedArray(a, uniqueCnt);
        System.out.println(" Original Array: ");
        Arrays.stream(a).forEach(System.out::println);

        System.out.println(" Duplicate removed array : ");
        Arrays.stream(arr).forEach(System.out::println);

    }

}
