import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lessThan18 = 0, between18And60 = 0, greaterThan60 = 0;

        for (int i = 0; i < 10; i++) {
            int age = sc.nextInt();
            if (age < 18) {
                lessThan18++;
            } else if (age <= 60) {
                between18And60++;
            } else {
                greaterThan60++;
            }
        }

        System.out.println("People <18: " + lessThan18);
        System.out.println("People 18-60: " + between18And60);
        System.out.println("People >60: " + greaterThan60);

        sc.close();
    }
}
