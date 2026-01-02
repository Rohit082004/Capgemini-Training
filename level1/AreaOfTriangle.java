import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float baseInInches = sc.nextFloat();
        float heightInInches = sc.nextFloat();

        float areaSquareInches = (baseInInches * heightInInches) / 2;

        float areaSquareCentimeters = areaSquareInches * 6.4516f;

        System.out.println(
                "The area of the triangle is " + areaSquareInches +
                " square inches and " + areaSquareCentimeters +
                " square centimeters"
        );

        sc.close();
    }
}
