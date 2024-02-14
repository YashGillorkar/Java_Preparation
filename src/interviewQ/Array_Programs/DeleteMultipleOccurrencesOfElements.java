package interviewQ.Array_Programs;

import java.util.Arrays;

public class DeleteMultipleOccurrencesOfElements {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 2, 9, 5, 9 };
        int del = 9;
        int count = 0;
        int j = 0;
        System.out.println("Original Array :" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != del) {
                arr[j++] = arr[i];
            } else {
                count++;
            }
        }
        int[] newArr = new int[arr.length - count];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }

        System.out.println("Modified Array :" + Arrays.toString(newArr));
    }
}
