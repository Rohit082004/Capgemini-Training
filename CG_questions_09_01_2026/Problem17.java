// binary to decimal

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();

        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary /= 10;
        }

        System.out.println(decimal);
    }
}
