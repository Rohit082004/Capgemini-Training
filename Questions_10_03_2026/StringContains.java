package Questions_10_03_2026;

import java.util.Scanner;

public class StringContains {
    public static boolean util(String s1, String s2){
        if(s1.contains(s2)) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(util(s1, s2) ? "Yes": "No");
    }
}
