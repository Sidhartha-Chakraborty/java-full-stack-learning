/**
 * Demonstrates variable-length arguments (varargs) in Java.
 *
 * Varargs allow a method to accept zero or more arguments
 * of the same type.
 */
public class Varargs {

    public static void main(String[] args) {

        System.out.println("Sum: " + calculateSum(10, 20));

        System.out.println("Sum: "
                + calculateSum(10, 20, 30, 40));

        System.out.println("Sum: "
                + calculateSum(5, 10, 15, 20, 25));
    }

    public static int calculateSum(int... numbers) {

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}