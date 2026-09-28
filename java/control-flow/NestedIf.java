public class NestedIf {

    public static void main(String[] args) {

        int age = 25;
        boolean hasLicense = true;

        if (age >= 18) {

            if (hasLicense) {
                System.out.println("Can drive");
            } else {
                System.out.println("Need a driving license");
            }

        } else {
            System.out.println("Too young to drive");
        }
    }
}