import java.util.Scanner;

public class WeightSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] w = new int[10];

        for (int i = 0; i < 10; i++) {
            w[i] = sc.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            int max = i;
            for (int j = i + 1; j < 10; j++) {
                if (w[j] > w[max]) {
                    max = j;
                }
            }
            int temp = w[i];
            w[i] = w[max];
            w[max] = temp;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(w[i]);
        }


    }
}
