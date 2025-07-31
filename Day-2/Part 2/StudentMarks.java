import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] roll = new int[10];
        int[][] marks = new int[10][3];

        for (int i = 0; i < 10; i++) {
            roll[i] = sc.nextInt();
            for (int j = 0; j < 3; j++) marks[i][j] = sc.nextInt();
        }

        System.out.println("RollNo Total Average");
        for (int i = 0; i < 10; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.printf("%d %d %.2f\n", roll[i], total, total / 3.0);
        }
        sc.close();
    }
}
