import java.util.Scanner;

public class TemperaturConversion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double farenheit = sc.nextDouble();

        double celsiusResult = (farenheit -32) *5/9;

        System.out.println("The " + farenheit + " farenheit is " + celsiusResult + " celsius");

        sc.close();
    }
}
