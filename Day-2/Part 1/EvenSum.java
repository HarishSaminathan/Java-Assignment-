public class EvenSum {
    public static void main(String[] args) {
        int n = 10, sum = 0, i = 1;
        while (i <= n) {
            if (i % 2 != 0) { i++; continue; }
            sum += i++;
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}
