
/**
 * Demonstrates sorting an array using the Java Arrays utility class.
 */
import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {

        int[] numbers = { 50, 20, 40, 10, 30 };

        System.out.println("Before sorting: "
                + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("After sorting: "
                + Arrays.toString(numbers));
    }
}