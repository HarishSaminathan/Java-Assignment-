import java.util.Scanner;

public class OddSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }

        System.out.println("Sum of odd numbers = " + sum);
    }
}
