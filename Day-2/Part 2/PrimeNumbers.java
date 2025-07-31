import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            values[i] = sc.nextInt();
        }

        System.out.println("Prime numbers are:");
        for (int i = 0; i < 10; i++) {
            int n = values[i];
            boolean isPrime = true;

            if (n < 2) isPrime = false;
            else {
                for (int j = 2; j <= n / 2; j++) {
                    if (n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(n + " ");
            }
        }
    }
}
