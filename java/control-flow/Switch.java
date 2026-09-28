import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Wellcome to day name finder");
        System.out.print("Please Enter the day number in week : ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1: {
                System.out.println("This is Sunday");
                break;
            }
            case 2: {
                System.out.println("this is monday");
                break;
            }
            case 3: {
                System.out.println("This is tuesday");
                break;
            }
            case 4: {
                System.out.println("This is Wednesday");
                break;
            }
            case 5: {
                System.out.println("This is Thursday");
                break;
            }
            case 6: {
                System.out.println("This is Friday");
                break;
            }
            case 7: {
                System.out.println("This is Saturday");
                break;
            }
            default: {
                System.out.println("Invalid input");

            }
                sc.close();

        }
    }
}