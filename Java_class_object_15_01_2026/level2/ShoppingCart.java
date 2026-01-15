public class ShoppingCart {
    public static void main(String[] args) {
        CartItem c1 = new CartItem("Lays", 25);

        c1.add(5);
        c1.add(10);
        c1.delete(7);

        c1.display();
    }
}

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String name, double p) {
        this.itemName = name;
        this.price = p;
        this.quantity = 0;
    }

    public void add(int q) {
        quantity += q;
        System.out.println("Added product");
    }

    public void delete(int q) {
        if (q <= quantity) {
            quantity -= q;
            System.out.println(q + " items removed");
        } else {
            System.out.println("No more items left");
        }
    }
    
    public void display() {
        System.out.println("Item name : " + itemName);
        System.out.println("Total price : " + (price * quantity));
    }
}
