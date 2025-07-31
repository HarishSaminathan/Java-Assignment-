import java.util.Scanner;
public class PowerTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt(); 
        if(num > 0 && (num & (num - 1)) == 0){
        System.out.println(num +" Num is power of 2");
        }
        else
          System.out.println(num +" Num is not power of 2");
    }
}