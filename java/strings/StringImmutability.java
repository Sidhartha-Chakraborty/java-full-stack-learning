/**
 * Demonstrates String immutability in Java.
 *
 * String objects cannot be modified after creation.
 * Operations that appear to modify a String actually create
 * a new String object.
 */
public class StringImmutability {

    public static void main(String[] args) {

        String original = "Java";

        String modified = original.concat(" Programming");

        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);

        System.out.println("Are both references the same object? "
                + (original == modified));
    }
}