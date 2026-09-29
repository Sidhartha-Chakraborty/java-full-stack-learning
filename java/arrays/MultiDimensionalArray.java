/**
 * Demonstrates the creation and traversal of a two-dimensional array.
 */
public class MultiDimensionalArray {

    public static void main(String[] args) {

        int[][] marks = {
                { 85, 90, 78 },
                { 88, 92, 80 },
                { 75, 89, 95 }
        };

        System.out.println("Student marks:");

        for (int row = 0; row < marks.length; row++) {

            for (int column = 0; column < marks[row].length; column++) {
                System.out.print(marks[row][column] + " ");
            }

            System.out.println();
        }
    }
}