package Searching_30_01_2026;

import java.util.Scanner;

public class ConcatenateStrings {
    public static String concatenate(String s1, String s2) {
        StringBuffer sb = new StringBuffer();
        sb.append(s1);
        sb.append(s2);
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(concatenate(s1, s2));
    }
}
