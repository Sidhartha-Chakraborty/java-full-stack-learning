/**
 * Demonstrates commonly used String methods in Java.
 */
public class StringMethods {

    public static void main(String[] args) {

        String message = "  Java Full Stack Development  ";

        System.out.println("Original: " + message);

        System.out.println("Trimmed: " + message.trim());

        System.out.println("Uppercase: "
                + message.toUpperCase());

        System.out.println("Lowercase: "
                + message.toLowerCase());

        System.out.println("Contains 'Java': "
                + message.contains("Java"));

        System.out.println("Starts with 'Java': "
                + message.trim().startsWith("Java"));

        System.out.println("Ends with 'Development': "
                + message.trim().endsWith("Development"));

        System.out.println("Replaced text: "
                + message.replace("Java", "Spring"));
    }
}