// GCD and LCM

import java.util.Scanner;

public class Problem9 {
    public static int LCM(int a, int b, int gcd){
        return (a * b) / gcd;
    }
    public static int GCD(int a, int b) {
        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = GCD(a, b);
        int lcm = LCM(a, b, gcd);

        System.out.println("gcd = " + gcd);
        System.out.println("lcm = " + lcm);
    }
}
