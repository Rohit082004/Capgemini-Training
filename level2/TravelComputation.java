import java.util.Scanner;

public class TravelComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String fromCity = sc.nextLine();
        String viaCity = sc.nextLine();
        String toCity = sc.nextLine();

        double distanceFromToVia = sc.nextDouble();
        int hours1 = sc.nextInt();
        int mins1 = sc.nextInt();
        int timeFromToVia = hours1 * 60 + mins1;

        double distanceViaToFinalCity = sc.nextDouble();
        int hours2 = sc.nextInt();
        int mins2 = sc.nextInt();
        int timeViaToFinalCity = hours2 * 60 + mins2;

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and the Total Time taken is " +
                totalTime + " minutes");
                
        sc.close();
    }
}

