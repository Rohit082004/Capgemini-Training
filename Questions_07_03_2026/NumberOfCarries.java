package Questions_07_03_2026;

import java.util.Scanner;

public class NumberOfCarries {
    public static int util(int num1, int num2){
        int count = 0;
        int carry = 0;
        while(num1 > 0 && num2 > 0){
            int d1 = num1 % 10;
            int d2 = num2 % 10;

            num1 /= 10;
            num2 /= 10;

            int sum = carry + d1 + d2;

            carry = sum / 10;
            if(carry > 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(util(num1, num2));
    }
}
