import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the pattern for pattern print :");
        int height = sc.nextInt();
        System.out.print("Enter the nuber for factorial :");
        int number = sc.nextInt();
        pattern(height);
        Factorial(number);
        sc.close();

    }

    public static void pattern(int height) {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void Factorial(int no) {
        int factorial = 1;

        for (int i = 1; i <= no; i++) {
            factorial = factorial * i;

        }

        System.out.println("The factorial of number " + no + "is " + factorial);

    }
}