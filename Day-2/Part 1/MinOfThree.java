import java.util.Scanner;

public class MinOfThree {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        
     
        int min;
        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }
        
       
        System.out.println("The minimum number is: " + min);
        
       
        
    }
}
