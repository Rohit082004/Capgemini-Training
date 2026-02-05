package Exception_Handling_05_02_2026;

import java.util.Scanner;

// throw vs throws
public class ExceptionPropagation {
    public static double calInterest(double amt, double rate, int time) throws IllegalArgumentException {
        if(amt < 0 || rate < 0){
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }

        return (amt * rate * time) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            double amt = sc.nextInt();
            double rate = sc.nextInt();
            int time = sc.nextInt();

            double interest = calInterest(amt, rate, time);
            System.out.println(interest);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
