public class ExeOrd {
    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Initializer block");
    }

    ExeOrd() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        new ExeOrd();
    }
}

