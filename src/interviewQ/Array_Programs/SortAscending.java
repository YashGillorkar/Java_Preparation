package interviewQ.Array_Programs;

import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {
        int[] arr = {23,5,7,9,32,45,6,1};
        int temp =0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int element : arr){
            System.out.println(element);
        }

        int[] arr2 = { 4,6,1,56,32,12,34,67};
        Arrays.sort(arr2);
        Arrays.stream(arr2).forEach(System.out::println);
        //Arrays.stream(arr2).forEach(a-> System.out.println(a));
    }
}
