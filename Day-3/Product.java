public class Product {
    int productId;
    String name;
    double price;
    int quantity;

    Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}