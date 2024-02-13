package practiceProgram.String;

import java.util.Arrays;

public class Que3 extends Que2{

    public String []  arrGetString(String [] str){
        String [] arrModified = new String[str.length];
        for (int i = 0; i< str.length; i++){
            String curr = str[i];
            arrModified[i] = getString(curr);
        }
        return arrModified;
    }
    public static void main(String[] args) {
        String[] arr = {"Te1Ch2noCr4e_%$d8iTs9", "Anki4T2", "Me1e2Nu4"};
        Que3 q = new Que3();
        System.out.println(Arrays.toString( q.arrGetString(arr)));


    }
}
