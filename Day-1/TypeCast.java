public class TypeCast {
    public static void main(String[] args) {
        double d = 10.75;
        int i = (int) d; 

        float f = 123.45f;
        byte b = (byte) f; 

        long l = 15003547352;
        short s = (short) l; 

        System.out.println("Double value: " + d);
        System.out.println("Converted to int: " + i);

        System.out.println("Float value: " + f);
        System.out.println("Converted to byte: " + b);

        System.out.println("Long value: " + l);
        System.out.println("Converted to short: " + s);
    }
}

