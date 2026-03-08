package Questions_07_03_2026;

import java.util.Scanner;

public class DigitSumDifference {
    public static int sumDigits(int num){
        int sum = 0;

        while(num > 0){
            int d = num % 10;
            sum += d;
            num = num / 10;
        }
        return sum;
    }

    public static int util(int m, int n){
        int div4 = 0;
        int div7 = 0;

        for(int i=m;i<=n;i++){
            if(i % 4 == 0){
                div4 += sumDigits(i);
            }
            if(i % 7 == 0){
                div7 += sumDigits(i);
            }
        }
        return Math.abs(div4 - div7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(util(m, n));
    }
}
