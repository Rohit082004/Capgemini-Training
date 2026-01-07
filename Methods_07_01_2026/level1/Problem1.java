// Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.

import java.util.Scanner;

public class Problem1 {
    
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + simpleInterest);
        sc.close();
    }
}
