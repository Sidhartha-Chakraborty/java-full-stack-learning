public class loops {

    public static void main(String[] args) {

        // For Loop
        System.out.println("=== For Loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // While Loop
        System.out.println("\n=== While Loop ===");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // Do-While Loop
        System.out.println("\n=== Do-While Loop ===");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        // Enhanced For Loop (For-Each)
        System.out.println("\n=== For-Each Loop ===");
        int[] numbers = { 10, 20, 30, 40, 50 };

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}