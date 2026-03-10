package Questions_10_03_2026;

import java.util.Scanner;

public class EnglishClass {
    public static String util(String str){
        if(str.length() < 10) return str;

        String ans = "";

        ans+= str.charAt(0);
        ans += String.valueOf(str.length()-2);
        ans+= str.charAt(str.length()-1);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();

        System.out.println(util(str));
    }
}
