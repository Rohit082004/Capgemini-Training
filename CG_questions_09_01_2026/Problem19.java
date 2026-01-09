// count even odd digit in number

import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int e = 0, o = 0;
        while (n > 0) {
            int d = n % 10;
            if ((d & 1) == 0) {
                e++;
            } else {
                o++;
            }
            n /= 10;
        }
        System.out.println("Even digits : " + e);
        System.out.println("Odd digits : " + o);
    }
}
