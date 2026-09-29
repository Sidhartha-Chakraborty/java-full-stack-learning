/**
 * Demonstrates searching for elements in an array.
 *
 * Includes:
 * - Linear search
 * - Binary search
 */
public class ArraySearching {

    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30, 40, 50, 60 };

        int target = 40;

        int linearResult = linearSearch(numbers, target);

        if (linearResult != -1) {
            System.out.println("Linear Search: Element found at index "
                    + linearResult);
        } else {
            System.out.println("Linear Search: Element not found");
        }

        int binaryResult = binarySearch(numbers, target);

        if (binaryResult != -1) {
            System.out.println("Binary Search: Element found at index "
                    + binaryResult);
        } else {
            System.out.println("Binary Search: Element not found");
        }
    }

    public static int linearSearch(int[] numbers, int target) {

        for (int index = 0; index < numbers.length; index++) {

            if (numbers[index] == target) {
                return index;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (numbers[middle] == target) {
                return middle;
            }

            if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}