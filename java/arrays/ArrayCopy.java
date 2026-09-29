
/**
 * Demonstrates different ways to copy arrays in Java.
 */
import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        int[] original = { 10, 20, 30, 40, 50 };

        // Using Arrays.copyOf()
        int[] copiedArray = Arrays.copyOf(original, original.length);

        // Using System.arraycopy()
        int[] partialCopy = new int[3];

        System.arraycopy(original, 1, partialCopy, 0, 3);

        System.out.println("Original array: "
                + Arrays.toString(original));

        System.out.println("Copied array: "
                + Arrays.toString(copiedArray));

        System.out.println("Partial copy: "
                + Arrays.toString(partialCopy));
    }
}