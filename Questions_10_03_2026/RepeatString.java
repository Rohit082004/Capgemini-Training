package Questions_10_03_2026;

import java.util.Scanner;

public class RepeatString {
    public static String util(int n, String str){
        String ans ="";
        for(int i=0;i<n;i++){
            ans += str;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(util(n, str));
    }
}
