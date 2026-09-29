import java.util.Scanner;

/**
 * Demonstrates different approaches to traversing an array.
 */
public class ArrayTraversal {

    public static void main(String[] args) {
        System.out.print("Enter the size of the array :  ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the %d Elements of array : ", i);
            numbers[i] = sc.nextInt();
        }

        System.out.println("Using traditional for loop:");

        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }

        System.out.println("\nUsing enhanced for loop:");

        for (int number : numbers) {
            System.out.println(number);
        }
        sc.close();
    }
}