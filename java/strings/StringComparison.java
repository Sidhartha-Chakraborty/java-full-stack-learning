/**
 * Demonstrates different approaches to comparing Strings in Java.
 */
public class StringComparison {

    public static void main(String[] args) {

        String first = "Java";
        String second = "Java";

        String third = new String("Java");

        // == compares references
        System.out.println("first == second: "
                + (first == second));

        System.out.println("first == third: "
                + (first == third));

        // equals() compares String content
        System.out.println("first.equals(second): "
                + first.equals(second));

        System.out.println("first.equals(third): "
                + first.equals(third));

        // equalsIgnoreCase() ignores letter case
        String language = "JAVA";

        System.out.println("Case-insensitive comparison: "
                + first.equalsIgnoreCase(language));
    }
}