public class VariableScope{

    static int staticVar = 10;
    int instanceVar = 20;

    public void showVariables() {
        int localVar = 30;
        final int finalVar = 40;

        {
            int blockVar = 50;
            System.out.println("Block variable: " + blockVar);
        }

        System.out.println("Static variable: " + staticVar);
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Local variable: " + localVar);
        System.out.println("Final variable: " + finalVar);
    }

    public static void main(String[] args) {
        VariableScope obj1 = new VariableScope();
        obj1.showVariables();

        VariableScope obj2 = new VariableScope();
        obj2.instanceVar = 99;
        staticVar = 88;

        System.out.println("\n-- Second Run --");
        obj1.showVariables();
        obj2.showVariables();
    }
}

