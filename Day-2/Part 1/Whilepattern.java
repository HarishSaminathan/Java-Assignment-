public class Whilepattern {
    public static void main(String[] args) {
        int r = 3, i = 1, num = 1;

        // Upper half including middle
        while (i <= r) {
            int space = r - i;
            while (space-- > 0) System.out.print("  ");

            int j = 1;
            while (j++ <= i) System.out.print(num++ + "   ");

            System.out.println();
            i++;
        }

        // Lower half
        i = r - 1;
        while (i >= 1) {
            int space = r - i;
            while (space-- > 0) System.out.print("  ");

            int j = 1;
            while (j++ <= i) System.out.print(num++ + "   ");

            System.out.println();
            i--;
        }
    }
}

