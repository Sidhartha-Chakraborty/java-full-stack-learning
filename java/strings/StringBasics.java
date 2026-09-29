/**
 * Demonstrates basic String creation and usage in Java.
 */
public class StringBasics {

    public static void main(String[] args) {

        String language = "Java";
        String firstName = "Sidhartha";
        String lastName = "Chakraborty";
        String fullName = firstName + " " + lastName;

        System.out.printf("My Name is %s", fullName);
        System.out.println("Language: " + language);
        System.out.println("Length: " + language.length());
        System.out.println("First character: " + language.charAt(0));
        System.out.println("Last character: " + language.charAt(language.length() - 1));
    }
}