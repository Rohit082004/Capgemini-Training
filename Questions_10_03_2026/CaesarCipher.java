package Questions_10_03_2026;

import java.util.Scanner;

public class CaesarCipher {
    public static String util(String str){
        String ans = "";

        for(int i=0;i<str.length();i++){
            char ch = (char) ((str.charAt(i) + 3 -97) % 26 + 97);
            ans += ch;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(util(str));
    }
}
