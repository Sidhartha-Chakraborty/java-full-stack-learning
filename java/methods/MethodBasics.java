/**
 * Demonstrates the basic structure and usage of methods in Java.
 *
 * A method is a block of code designed to perform a specific task.
 */
public class MethodBasics {

    public static void main(String[] args) {

        // Calling a method
        greet();

        // Calling the same method multiple times
        greet();
    }

    /**
     * Prints a greeting message.
     */
    public static void greet() {
        System.out.println("Hello! Welcome to Java Methods.");
    }
}