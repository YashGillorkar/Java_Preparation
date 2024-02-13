package practiceProgram.String;
// print only name whose character end or start with n
//String[] name = {"Kangan", "Krati", "Krishna", "Aashvi"};
public class Que1 {
    public static void main(String[] args) {
        String[] name = {"Kangan", "Krati", "Krishna", "Aashvi"};
        for (int i = 0 ; i<4; i++){
            String word = name[i];
            if (word.toLowerCase().charAt(0) == 'n' || word.toLowerCase().charAt(word.length() - 1) == 'n') {
                System.out.println(word);
            }
        }

    }
}
