import java.util.Scanner;

public class EquTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        int xor = a ^ b;  

        String[] result = {"Numbers are equal", "Numbers are not equal"};
       
        System.out.println(result[(xor >>> 31) | (xor & 1)]);

        sc.close();
        
    }
}

