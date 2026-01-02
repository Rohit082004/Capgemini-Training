
import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int feets = sc.nextInt();

        double yards = feets / 3.0;

        double miles = feets / 5280.0;

        System.out
                .println("Distance in feets is " + feets + " while in yards is " + yards + " and in miles is " + miles);
        
        sc.close();

    }
}
