//7. **Check for Substring**:
// Create a Java program to check if one string is a substring of another.

package interviewQ.String_Programs;

public class SubStringChecker {
    public static void main(String[] args) {
        String mainString = "Hello World";
        String subString = "World";
        if (mainString.contains(subString))
            System.out.println("'" + subString + "' is a substring of '" + mainString + "'");
        else
            System.out.println("'" + subString + "' is not a substring of '" + mainString + "'");
    }
}
