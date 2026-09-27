import java.util.Scanner;

public class BitWise_Oparator {
    public static void main(String[] args) {
        System.out.print("Enter the first number : ");

        Scanner sc = new Scanner(System.in);
        int firstNo = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int secondNo = sc.nextInt();

        int result_AND = firstNo & secondNo;
        int result_OR = firstNo | secondNo;
        int result_NOT = firstNo ^ secondNo;
        int result_XOR = ~firstNo;
        int result_LEFT_SHIFT = secondNo << 1;
        int result_RIGHT_SHIFT = secondNo >> 1;

        System.out.println("The result for AND is " + result_AND);
        System.out.println("The result for OR is " + result_OR);
        System.out.println("The result for XOR is " + result_XOR);
        System.out.println("The result for NOT is " + result_NOT);
        System.out.println("The result for LEFT SHIFT is " + result_LEFT_SHIFT);
        System.out.println("The result for RIGHT SHIFT is " + result_RIGHT_SHIFT);

        sc.close();

    }
}