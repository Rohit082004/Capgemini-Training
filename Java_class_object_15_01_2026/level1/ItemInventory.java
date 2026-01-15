public class ItemInventory {
    public static void main(String[] args) {
        Items i1 = new Items(10, "Book", 599, 6);

        i1.display();
        i1.calculateCost(i1.price, i1.quantity);
    }
}

class Items {
    int itemCode;
    String itemName;
    double price;
    int quantity;

    Items(int code, String name, double p, int q) {
        this.itemCode = code;
        this.itemName = name;
        this.price = p;
        this.quantity = q;
    }

    public void display() {
        System.out.println("ItemCode : " + itemCode);
        System.out.println("ItemName : " + itemName);
        System.out.println("Price : " + price);
    }

    public void calculateCost(double price, int quantity) {
        System.out.println("Total cost : " + price * quantity);
    }
}
