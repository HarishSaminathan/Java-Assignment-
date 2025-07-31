class BasicCalculator {
    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
    int multiply(int a, int b) {
        return a * b;
    }
    double divide(int a, int b) {
        return (double) a / b;
    }
}

class AdvancedCalculator extends BasicCalculator {
    long power(int base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) result *= base;
        return result;
    }
    int modulus(int a, int b) {
        return a % b;
    }
    double squareRoot(double n) {
        return Math.sqrt(n);
    }
}

public class ScientificCalculator extends AdvancedCalculator {
    double sin(double angle) {
        return Math.sin(Math.toRadians(angle));
    }
    double cos(double angle) {
        return Math.cos(Math.toRadians(angle));
    }
    double log(double value) {
        return Math.log10(value);
    }

    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();
        System.out.println(calc.add(5, 3));
        System.out.println(calc.subtract(5, 3));
        System.out.println(calc.multiply(5, 3));
        System.out.println(calc.divide(6, 2));
        System.out.println(calc.power(2, 3));
        System.out.println(calc.modulus(10, 3));
        System.out.println(calc.squareRoot(16));
        System.out.println(calc.sin(30));
        System.out.println(calc.cos(60));
        System.out.println(calc.log(100));
    }
}
