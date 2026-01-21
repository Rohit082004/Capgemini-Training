package Encapsulation_Polymorphism_20_01_2026;

import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> al = new ArrayList<>();

        Electronics e = new Electronics(1, "Laptop", 60000);
        Clothing c = new Clothing(2, "Jacket", 3000);
        Groceries g = new Groceries(3, "Apple", 200);

        al.add(e);
        al.add(c);
        al.add(g);

        for(Product p : al){
            double tax=p.calculateTax();
            double dis = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - dis;

            System.out.println("Product : " + p.getName());
            System.out.println("Base Price : " + p.getPrice());
            System.out.println("Discount : " + dis);
            System.out.println("Tax : " + tax);
            System.out.println("Final Price : " + finalPrice);
            System.out.println();
        }
    }
}

interface Taxable{
    double calculateTax();
    String getTaxDetails();
}

abstract class Product implements Taxable{
    private int productId;
    private String name;
    protected double price;

    Product(int id, String n, double p){
        this.productId = id;
        this.name=n;
        this.price=p;
    }

    abstract double calculateDiscount();

    public void setId(int id){
        this.productId = id;
    }
    public int getId() {
        return productId;
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }

    public void setPrice(double p){
        this.price = p;
    }
    public double getPrice(){
        return price;
    }
}

class Electronics extends Product{
    public Electronics(int id, String n, double p){
        super(id, n, p);
    }

    @Override
    public double calculateDiscount(){
        return (price * 20) / 100;
    }

    @Override
    public double calculateTax(){
        return (price * 18) / 100;
    }

    @Override
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }

}

class Clothing extends Product{
    public Clothing(int id, String n, double p){
        super(id, n, p);
    }

    @Override
    public double calculateDiscount(){
        return (price * 10) / 100;
    }

    @Override
    public double calculateTax() {
        return price * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "5% GST on Clothing";
    }
}

class Groceries extends Product{
    public Groceries(int id, String n, double p){
        super(id, n, p);
    }

    @Override
    public double calculateDiscount(){
        return (price * 5) / 100;
    }

    @Override
    public double calculateTax() {
        return 0;
    }

    @Override
    public String getTaxDetails() {
        return "No tax on groceries";
    }
}


