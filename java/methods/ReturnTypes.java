/**
 * Demonstrates methods with different return types.
 */
public class ReturnTypes {

    public static void main(String[] args) {

        int sum = addNumbers(10, 20);
        double average = calculateAverage(80, 90, 70);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    public static int addNumbers(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public static double calculateAverage(
            int firstNumber,
            int secondNumber,
            int thirdNumber) {

        return (firstNumber + secondNumber + thirdNumber) / 3.0;
    }
}