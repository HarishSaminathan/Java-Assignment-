public class EmployeeDetails {
    String name;
    int yearOfJoining;
    String address;
    double salary;

    EmployeeDetails(String name, int yearOfJoining, String address, double salary) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
        this.salary = salary;
    }

    public static void main(String[] args) {
        EmployeeDetails[] employees = {
            new EmployeeDetails("Robert", 1994, "64C- WallsStreat", 50000),
            new EmployeeDetails("Sam", 2000, "68D- WallsStreat", 60000),
            new EmployeeDetails("John", 1999, "26B- WallsStreat", 55000)
        };
        System.out.printf("%-10s %-15s %-20s%n", "Name", "Year of joining", "Address");
        for (EmployeeDetails emp : employees) {
            System.out.printf("%-10s %-15d %-20s%n", emp.name, emp.yearOfJoining, emp.address);
        }
    }
}