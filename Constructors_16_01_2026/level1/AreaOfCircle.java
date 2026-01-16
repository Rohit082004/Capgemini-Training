public class AreaOfCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(Circle.area(c1.radius));

        Circle c2 = new Circle(5);
        System.out.println(Circle.area(c2.radius));
    }
}

class Circle {
    double radius;

    // default constructor
    public Circle() {
        this.radius = 4;
    }
    
    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public static double area(double r) {
        return 3.14 * r * r;
    }
}
