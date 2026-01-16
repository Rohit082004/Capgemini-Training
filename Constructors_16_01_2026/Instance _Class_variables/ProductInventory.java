public class ProductInventory {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Mobile", 70000);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}

class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String name, double p) {
        this.productName = name;
        this.price = p;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product name : " + productName);
        System.out.println("Price : " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total products : " + totalProducts);
    }
}
