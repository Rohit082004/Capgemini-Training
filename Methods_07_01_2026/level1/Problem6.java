// Write a program to find the sum of n natural numbers using loop

import java.util.Scanner;

public class Problem6 {
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = findSum(n);
        System.out.println("The sum of first " + n + " natural numbers is " + result);

        sc.close();
    }
}
