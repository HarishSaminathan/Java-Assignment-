import java.util.Scanner;

public class DigitSum {
    static void print(int[] x, int n) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int i = 0; i < n; i++) {
            if (x[i] >= 0 && x[i] <= 9) {
                singleDigitSum += x[i];
            } else if (x[i] >= 10 && x[i] <= 99) {
                doubleDigitSum += x[i];
            }
        }

        System.out.println(singleDigitSum);
        System.out.println(doubleDigitSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }

        print(arr, len);

    }
}
