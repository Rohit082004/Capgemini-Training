// Fibonacci series upto n

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        int i=3;
        while (i <= n) {
            int c = a + b;
            a=b;
            b=c;
            System.out.print(c + " ");
            i++;
        }
    }
}
