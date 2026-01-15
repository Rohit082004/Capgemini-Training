public class MobilePhoneHandling {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("Iphone", "14 pro", 135000);
        m1.display();
    }
}

class MobilePhone {
    String brand;
    String model;
    double price;

    public MobilePhone(String b, String m, double p) {
        this.brand = b;
        this.model = m;
        this.price = p;
    }

    public void display() {
        System.out.println("Mobile Brand : " + brand);
        System.out.println("Mobile model : " + model);
        System.out.println("Price : " + price);
    }
    

}
