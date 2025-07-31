import java.util.ArrayList;
import java.util.List;

public class Store {
    static String storeName;
    static String storeLocation;
    static List<Product> products = new ArrayList<>();

    static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
    }

    static void displayStoreDetails() {
        System.out.println("Store: " + storeName + ", Location: " + storeLocation);
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void displayAllProducts() {
        for (Product p : products) {
            p.displayProduct();
        }
    }

    public static void main(String[] args) {
        Store.setStoreDetails("SuperMart", "123 City Rd");
        Store store = new Store();
        Product p1 = new Product(1, "Laptop", 999.99, 10);
        Product p2 = new Product(2, "Phone", 499.99, 20);
        store.addProduct(p1);
        store.addProduct(p2);
        Store.displayStoreDetails();
        store.displayAllProducts();
    }
}