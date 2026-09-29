/**
 * Demonstrates mutable string manipulation using StringBuilder.
 *
 * StringBuilder is useful when multiple modifications are required
 * on a string within a single-threaded context.
 */
public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Java");

        builder.append(" Full Stack");
        builder.append(" Developer");

        builder.insert(5, "Backend ");

        builder.replace(0, 4, "Spring");

        System.out.println("Result: " + builder);
        builder.delete(0, 6);
        System.out.println("After delete : " + builder);

        builder.reverse();

        System.out.println("Reversed: " + builder);
    }
}