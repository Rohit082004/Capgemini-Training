public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Kinderjoy", 50, 20);

        p1.display(p1);
        Product.updateDiscount(10);
        System.out.println();
        p1.display(p1);
    }
}

class Product {
    static int discount = 6;

    String productName;
    double price;
    int quantity;

    final int productID;

    public Product(int id, String n, double p, int q) {
        this.productID = id;
        this.productName = n;
        this.price = p;
        this.quantity = q;
    }

    public static void updateDiscount(int d) {
        discount = d;
    }

    public double calPrice(){
        double total = price * quantity;
        double dis = (discount * total) / 100;

        return total - dis;
    }
    
    public void display(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            System.out.println("Product id : " + p.productID);
            System.out.println("Product name : " + p.productName);
            System.out.println("Product price : " + p.price);
            System.out.println("Product quantity : " + p.quantity);
            System.out.println("Discount given : " + Product.discount);
            System.out.println("Total cost of products : " + calPrice());
        }
        else {
            System.out.println("Not a product object");
        }
    }
}
