package Generics_04_02_2026;

import java.util.ArrayList;
import java.util.List;

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        Product<BookCategory> book =
                new Product<>(1, "Java Programming", 599, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>(2, "Denim Shirt", 1299, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>(3, "Smartphone", 25999, new GadgetCategory());

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);


        System.out.println("------ BEFORE DISCOUNT ------");
        catalog.displayCatalog();

        MarketplaceUtils.applyDiscount(book, 10);
        MarketplaceUtils.applyDiscount(phone, 5);

        System.out.println("\n------ AFTER DISCOUNT ------");
        catalog.displayCatalog();
    }
}

interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    public String getCategoryName() {
        return "Books";
    }
}

class ClothingCategory implements Category {
    public String getCategoryName() {
        return "Clothing";
    }
}

class GadgetCategory implements Category {
    public String getCategoryName() {
        return "Gadgets";
    }
}

class Product<T extends Category> {

    private int id;
    private String name;
    private double price;
    private T category;

    public Product(int id, String name, double price, T category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }

    public void display() {
        System.out.println(
                "ID: " + id +
                        ", Name: " + name +
                        ", Price: ₹" + price +
                        ", Category: " + category.getCategoryName()
        );
    }
}

class MarketplaceUtils {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);

        System.out.println("Discount applied successfully!");
    }
}

class Catalog {
    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }
    public void displayCatalog() {
        if (products.isEmpty()) {
            System.out.println("Catalog is empty.");
            return;
        }
        for (Product<?> product : products) {
            product.display();
        }
    }
}


