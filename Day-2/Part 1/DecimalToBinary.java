public class DecimalToBinary {
    public static String toBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Binary of " + num + " is: " + toBinary(num));
    }
}
