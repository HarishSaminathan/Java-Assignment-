public class Vehicle {
    static int vehicleCount = 0;
    int vehicleId;
    String brandName;
    double price;

    Vehicle(int vehicleId, String brandName, double price) {
        this.vehicleId = vehicleId;
        this.brandName = brandName;
        this.price = price;
        vehicleCount++;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(101, "Toyota", 25000.0);
        Vehicle v2 = new Vehicle(102, "Honda", 30000.0);
        System.out.println("Vehicle 1: ID=" + v1.vehicleId + ", Brand=" + v1.brandName + ", Price=" + v1.price);
        System.out.println("Vehicle 2: ID=" + v2.vehicleId + ", Brand=" + v2.brandName + ", Price=" + v2.price);
        System.out.println("Total Vehicles: " + vehicleCount);
    }
}