//String msg = "Te1Ch2noCr4e_%$d8iTs9"
//output : 12489TCCTehnoredis

package practiceProgram.String;

public class Que2 {
    String msg = "Te1Ch2noCr4e_%$d8iTs9";
    String digit = "";
    String upperCase ="";
    String lowerCase ="";
    public String getString(String msg){
        for( int i = 0; i<msg.length(); i++){
            char c = msg.charAt(i);
            if (Character.isLowerCase(c)){
                lowerCase = lowerCase+c;
            } else if (Character.isUpperCase(c)) {
                upperCase = upperCase+c;
            }
            else if (Character.isDigit(c)){
                digit = digit + c;
            }
        }
        return digit+upperCase+lowerCase;
    }
    public static void main(String[] args) {
        Que2 q = new Que2();
        q.getString(q.msg);
    }
}
