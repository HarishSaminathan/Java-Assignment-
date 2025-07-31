public class ArrayCompare {
    public static void main(String[] args) {
        char[] X = { 'm', 'n', 'o', 'p' };
        char[] Y = { 'm', 'n', 'o', 'p' };

        boolean areIdentical = true;

        if (X.length != Y.length) {
            areIdentical = false;
        } else {
            for (int i = 0; i < X.length; i++) {
                if (X[i] != Y[i]) {
                    areIdentical = false;
                    break;
                }
            }
        }

        if (areIdentical) {
            System.out.println("The arrays are identical.");
        } else {
            System.out.println("The arrays are not identical.");
        }
    }
}
