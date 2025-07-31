public class Employee {
    String name;
    int employeeId;
    String designation;
    double salary;

    Employee() {
        System.out.println("Employee object created");
        this.name = "Unknown";
        this.employeeId = 0;
        this.designation = "None";
        this.salary = 0.0;
    }

    Employee(String name, int employeeId, String designation, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.designation = designation;
        this.salary = salary;
    }

    Employee(Employee other) {
        this.name = other.name;
        this.employeeId = other.employeeId;
        this.designation = other.designation;
        this.salary = other.salary;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Alice", 101, "Manager", 75000.0);
        Employee emp3 = new Employee(emp2);
        System.out.println("Emp1: " + emp1.name + ", ID: " + emp1.employeeId + ", Designation: " + emp1.designation + ", Salary: " + emp1.salary);
        System.out.println("Emp2: " + emp2.name + ", ID: " + emp2.employeeId + ", Designation: " + emp2.designation + ", Salary: " + emp2.salary);
        System.out.println("Emp3: " + emp3.name + ", ID: " + emp3.employeeId + ", Designation: " + emp3.designation + ", Salary: " + emp3.salary);
    }
}