// Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text.

import java.util.Scanner;

public class Problem2 {
    public static String StringSubstring(String str, int s, int e) {
        StringBuilder sb = new StringBuilder();
        for (int i = s; i < e; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int s = sc.nextInt();
        int e = sc.nextInt();

        String s1 = str.substring(s,e);
        String s2 = StringSubstring(str, s, e);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
    }
}
