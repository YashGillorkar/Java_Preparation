package interviewQ.Array_Programs;

public class SortDescending {

    public static void main(String[] args) {
        int[] arr = {23,5,7,9,32,45,6,1};
        int temp =0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int element : arr){
            System.out.println(element);
        }
    }
}
