import java.util.Scanner;

public class RunningAthlete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        int perimeter = s1 + s2 + s3;
        double rounds = 5000.0 / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}
