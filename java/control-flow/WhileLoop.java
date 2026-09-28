public class WhileLoop {

    public static void main(String[] args) {

        int num = 2;

        while (num <= 100) {

            boolean isPrime = true;
            int divisor = 2;

            while (divisor <= num / 2) {

                if (num % divisor == 0) {
                    isPrime = false;
                    break;
                }

                divisor++;
            }

            if (isPrime) {
                System.out.print(num + " ");
            }

            num++;
        }
    }
}
