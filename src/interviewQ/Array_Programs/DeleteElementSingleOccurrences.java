package interviewQ.Array_Programs;

import java.util.Arrays;

public class DeleteElementSingleOccurrences {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 2, 1, 5, 9 };
        int del = 9;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == del) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }
        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i];
        }
        System.out.println("Original Array :" + Arrays.toString(arr));
        System.out.println("Modified Array :" + Arrays.toString(newArr));
    }
}
