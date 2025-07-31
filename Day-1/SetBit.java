import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("No set bits (number is zero)");
        } else {
            int position = Integer.numberOfTrailingZeros(num) + 1;
            System.out.println("First set bit is at position: " + position);
        }
    }
}