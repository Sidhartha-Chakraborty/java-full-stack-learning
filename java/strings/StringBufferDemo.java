/**
 * Demonstrates mutable string manipulation using StringBuffer.
 *
 * StringBuffer provides synchronized methods and is designed
 * for situations where thread-safe mutable string operations
 * are required.
 */
public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("Java");

        buffer.append(" Programming");

        buffer.insert(5, "Full Stack ");

        System.out.println("Result: " + buffer);

        buffer.reverse();

        System.out.println("Reversed: " + buffer);
    }
}