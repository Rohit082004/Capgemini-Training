package Generics_04_02_2026;

import java.util.ArrayList;
import java.util.List;

public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {

        Storage<Electronics> electronicStorage = new Storage<>();
        Storage<Groceries> groceryStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();


        electronicStorage.addItem(new Electronics(1, "Laptop", 2));
        electronicStorage.addItem(new Electronics(2, "Smartphone", 1));

        groceryStorage.addItem(new Groceries(3, "Milk", "10-Feb-2026"));
        groceryStorage.addItem(new Groceries(4, "Bread", "05-Feb-2026"));

        furnitureStorage.addItem(new Furniture(5, "Chair", "Wood"));
        furnitureStorage.addItem(new Furniture(6, "Table", "Steel"));

        System.out.println("\n----- Electronics Storage -----");
        WarehouseUtils.displayAll(electronicStorage.getItems());

        System.out.println("\n----- Grocery Storage -----");
        WarehouseUtils.displayAll(groceryStorage.getItems());

        System.out.println("\n----- Furniture Storage -----");
        WarehouseUtils.displayAll(furnitureStorage.getItems());
    }
}

abstract class WarehouseItem {
    private int id;
    private String name;
    public WarehouseItem(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public abstract void display();
}

class Electronics extends WarehouseItem {
    private int warranty;
    public Electronics(int id, String name, int warranty) {
        super(id, name);
        this.warranty = warranty;
    }
    @Override
    public void display() {
        System.out.println("Electronics -> ID: " + getId()
                + ", Name: " + getName()
                + ", Warranty: " + warranty + " years");
    }
}

class Groceries extends WarehouseItem {
    private String expiryDate;
    public Groceries(int id, String name, String expiryDate) {
        super(id, name);
        this.expiryDate = expiryDate;
    }
    @Override
    public void display() {
        System.out.println("Groceries -> ID: " + getId()
                + ", Name: " + getName()
                + ", Expiry Date: " + expiryDate);
    }
}

class Furniture extends WarehouseItem {
    private String material;
    public Furniture(int id, String name, String material) {
        super(id, name);
        this.material = material;
    }
    @Override
    public void display() {
        System.out.println("Furniture -> ID: " + getId()
                + ", Name: " + getName()
                + ", Material: " + material);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) {
        items.add(item);
        System.out.println(item.getName() + " added successfully.");
    }
    public void removeItem(T item) {
        items.remove(item);
        System.out.println(item.getName() + " removed successfully.");
    }
    public List<T> getItems() {
        return items;
    }
}

class WarehouseUtils {
    public static void displayAll(List<? extends WarehouseItem> list) {
        if (list.isEmpty()) {
            System.out.println("Storage is empty.");
            return;
        }
        for (WarehouseItem item : list) {
            item.display();
        }
    }
}


