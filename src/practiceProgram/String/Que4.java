// Tech1no4CRE5dit1S
// output : 11

package practiceProgram.String;

public class Que4 {
    static String input = "Tech1no4CRE5dit1S";
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i< input.length(); i++){
            char c = input.charAt(i);
            if (Character.isDigit(c)){
                sum = sum +Character.getNumericValue(c);
            }
        }
        System.out.println("Number of digit in "+input+ " is "+ sum);
    }
}
