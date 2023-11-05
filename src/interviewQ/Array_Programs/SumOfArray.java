//4. Write a Java program to find the sum of all elements in an array.
package interviewQ.Array_Programs;

public class SumOfArray {
    static int[] arr = {3, 23, 53, 67, 89, 12, 34};

    public static void main(String[] args) {
        int sum = 0;
        for(int i= 0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println("Sum of element in array are:- "+sum);
    }
}
