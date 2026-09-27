import java.util.Scanner;

public class Odd_EvenCheck {
    public static void main(String[] args) {
        System.out.println("wwellcome to odd even checker");
        System.out.print("Enter the number to check : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number" + number + "is an Even number");
        } else {
            System.out.println("The number" + number + "is an odd number");
        }

        sc.close();
    }
}