import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("wellcome temperature converter");
        System.out.println(
                "Enter C for conver temperature celsius to fahrenheit and if fahrenheit to celsious then Enter F ");

        Scanner sc = new Scanner(System.in);
        char type = sc.next().charAt(0);

        if (type == 'C') {
            System.out.print("Enter the temperature in fahrenheit :");
            double fahrenheit = sc.nextDouble();

            double celsius = (5.0 / 9.0) * (fahrenheit - 32);
            System.out.println("the temperature in celsius is- " + celsius);
        }
        if (type == 'F') {
            System.out.print("Enter the temperature in celsious :");
            double celsius = sc.nextDouble();
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.println("the temperature in fahrenheit is- " + fahrenheit);

        }
    }

}