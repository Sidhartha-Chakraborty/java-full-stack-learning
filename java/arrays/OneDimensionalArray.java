/**
 * Demonstrates the creation, initialization, and basic usage
 * of a one-dimensional array in Java.
 */
public class OneDimensionalArray {

    public static void main(String[] args) {

        // Declaration and initialization
        int[] marks = { 85, 90, 78, 92, 88 };

        System.out.println("Number of elements: " + marks.length);

        System.out.println("First mark: " + marks[0]);
        System.out.println("Last mark: " + marks[marks.length - 1]);

        // Updating an array element
        marks[2] = 80;

        System.out.println("Updated third mark: " + marks[2]);
    }
}