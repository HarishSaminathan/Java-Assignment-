public class StudentDetails {
    String name;
    int roll_no;
    int phone_no;
    String address;

    StudentDetails(String name, int roll_no, int phone_no, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }

    public static void main(String[] args) {
        StudentDetails student1 = new StudentDetails("Sam", 1, 1234567890, "123 Main St");
        StudentDetails student2 = new StudentDetails("John", 2, 987654321, "456 Oak Ave");
        System.out.println("Name: " + student1.name + ", Roll No: " + student1.roll_no + ", Phone: " + student1.phone_no + ", Address: " + student1.address);
        System.out.println("Name: " + student2.name + ", Roll No: " + student2.roll_no + ", Phone: " + student2.phone_no + ", Address: " + student2.address);
    }
}