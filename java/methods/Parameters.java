/**
 * Demonstrates passing parameters to methods.
 *
 * Parameters allow a method to receive data from the caller.
 */
public class Parameters {

    public static void main(String[] args) {

        displayUser("Sidhartha", 22);

        displayUser("Rahul", 23);
    }

    public static void displayUser(String name, int age) {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("--------------------");
    }
}