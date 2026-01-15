public class AreaOfCircle {
    final static  double PI = 3.14;
    static class Area {
        double radius;

        Area(double radius) {
            this.radius = radius;
        }

        public static double area(double r) {
            return PI * r * r;
        }

        public static double circumfrence(double r) {
            return 2 * PI * r;
        }
    }

    public static void main(String[] args) {
        Area c1 = new Area(5);
        System.out.println(Area.area(c1.radius));
        System.out.println(Area.circumfrence(c1.radius));
    }
}
