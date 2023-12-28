package interviewQ.Character_Class_Programs;

public class CharacterExtraction_2 {
    public static void main(String[] args) {
        String str  = "Ya3s1H";
        String digits ="";
        String lowerCase = "";
        String upperCase = "";
        for (int i = 0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))) {
                digits = digits+ str.charAt(i);
            } else if (Character.isUpperCase(str.charAt(i))) {
                upperCase = upperCase + str.charAt(i);
            } else if (Character.isLowerCase(str.charAt(i))) {
                lowerCase = lowerCase + str.charAt(i);
            }
        }
        System.out.println(digits+upperCase+lowerCase);
    }
}
