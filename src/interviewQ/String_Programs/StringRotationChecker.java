package interviewQ.String_Programs;

public class StringRotationChecker {
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";

        if (isRotation(str1, str2)) {
            System.out.println("'" + str2 + "' is a rotation of '" + str1 + "'");
        } else {
            System.out.println("'" + str2 + "' is not a rotation of '" + str1 + "'");
        }
    }

    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length() || str1.isEmpty())
            return false;

        String concatenatedStr = str1 + str1;

        return concatenatedStr.contains(str2);
    }
}
