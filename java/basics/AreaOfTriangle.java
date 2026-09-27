import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Please Enter the length of base of triangle in cm : ");
        Scanner sc = new Scanner(System.in);
        int Base = sc.nextInt();
        System.out.println("Please Enter the height of triangle : ");
        int height = sc.nextInt();

        int area = (Base * height) / 2;

        System.out.println("The area of triangle is " + area);

        sc.close();

    }

}