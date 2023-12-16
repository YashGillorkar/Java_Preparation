package interviewQ.Basic_JavaPrograms;

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 to 100 are: ");
        int count = 0;
        for(int i = 2; i<= 100 ; i++){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total number of prime in between 1 to 100 are: "+count);
    }

    private static boolean isPrime(int num){

        if (num < 2) {
            return false;
        }

        for(int i = 2 ; i<= Math.sqrt(num) ; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

}
