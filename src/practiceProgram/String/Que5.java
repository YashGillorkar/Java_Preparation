// Tech1no4CRE5dit1S
// output : 11

package practiceProgram.String;

public class Que5 {

    void doAddition(String str){
        int sum = 0;
        for (int i =0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c>=48 && c<=57){
                sum = sum+ (c-48);
            }
        }
        System.out.println("Number of digit in "+str+ " is "+ sum);
    }

    public static void main(String[] args) {
        new Que5().doAddition("Tech1no4CRE5dit1S");
    }
}
