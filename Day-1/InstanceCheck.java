class Student {}

public class InstanceCheck {
    public static void main(String[] args) {
        Student s = new Student();

        if (s instanceof Student) {
            System.out.println("s is an instance of Student");
        }
    }
}
