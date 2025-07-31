public class OneRPattern {
    public static void main(String[] args) {
        printXPattern();
        System.out.println();
        printRPattern();
    }

    static void printXPattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((i == j || i + j == 4) ? "1" : " ");
            }
            System.out.println();
        }
    }

    static void printRPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print((i == 1 || i == 3 || (i == 4 && (j == 1 || j == 3)) || ((i == 2 || i == 5) && (j == 1 || j == 4))) ? "R" : " ");
            }
            System.out.println();
        }
    }
}
