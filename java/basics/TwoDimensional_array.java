import java.util.Scanner;

public class TwoDimensional_array {
    public static void main(String[] args) {
        System.out.println("Enter the row size and column size : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] array = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter the " + i + j + " position element : ");
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
        sc.close();

    }

}