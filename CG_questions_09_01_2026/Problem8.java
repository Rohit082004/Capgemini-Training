//Armstrong number or not

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n, count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        temp = n;
        int sum=0;
        while (temp > 0) {
            int dig = temp % 10;
            sum += Math.pow(dig, count);
            temp /= 10;
        }
        if(sum == n)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
