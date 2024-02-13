package interviewQ.Array_Programs;

public class CountUniqueElements {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1,5};
        int uniqueCnt = arr.length;
        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    uniqueCnt--;
                    break;
                }
            }
        }
        System.out.println("Number of unique elements in Array are : "+uniqueCnt);
    }
}
