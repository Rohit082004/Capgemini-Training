package Questions_10_03_2026;

import java.util.Scanner;

public class ReverseNumber {
    public static int util(int n){
        int rev =0;
        int t= n;
        while(t > 0){
            rev = (rev *10) + (t % 10);
            t=t/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        System.out.println(util(n));
    }
}
