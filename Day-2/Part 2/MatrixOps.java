import java.util.Scanner;

public class MatrixOps {
    static void input(int[][] A, Scanner sc) {
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                A[i][j] = sc.nextInt();
    }

    static void display(int[][] A) {
        for (int[] row : A) {
            for (int v : row) System.out.print(v + " ");
            System.out.println();
        }
    }

    static int sumAll(int[][] A) {
        int s = 0;
        for (int[] row : A)
            for (int v : row) s += v;
        return s;
    }

    static void rowSum(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int s = 0;
            for (int v : A[i]) s += v;
            System.out.println("Row " + (i + 1) + ": " + s);
        }
    }

    static void colSum(int[][] A) {
        for (int j = 0; j < A[0].length; j++) {
            int s = 0;
            for (int i = 0; i < A.length; i++) s += A[i][j];
            System.out.println("Col " + (j + 1) + ": " + s);
        }
    }

    static int[][] transpose(int[][] A) {
        int[][] T = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                T[j][i] = A[i][j];
        return T;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] A = new int[m][n];
        int ch;
        do {
            System.out.println("1.Input 2.Display 3.SumAll 4.RowSum 5.ColSum 6.Transpose 7.Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1: input(A, sc); break;
                case 2: display(A); break;
                case 3: System.out.println(sumAll(A)); break;
                case 4: rowSum(A); break;
                case 5: colSum(A); break;
                case 6: display(transpose(A)); break;
            }
        } while (ch != 7);
        sc.close();
    }
}
