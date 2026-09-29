/**
 * Demonstrates method overloading in Java.
 *
 * Method overloading allows multiple methods to have the same name
 * but different parameter lists.
 */
public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println("Integer addition: " + add(10, 20));

        System.out.println("Three integer addition: "
                + add(10, 20, 30));

        System.out.println("Double addition: "
                + add(10.5, 20.5));

        System.out.println("String concatenation: "
                + add("Java ", "Programming"));
    }

    public static int add(int first, int second) {
        return first + second;
    }

    public static int add(int first, int second, int third) {
        return first + second + third;
    }

    public static double add(double first, double second) {
        return first + second;
    }

    public static String add(String first, String second) {
        return first + second;
    }
}