// Write a program to convert the complete text to lowercase and compare the results

import java.util.Scanner;

public class Problem5 {
    public static boolean compareStrings(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static String lowercaseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            sb.append(ch);
        }
        return sb.toString();
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String s1 = lowercaseString(str);
        String s2 = str.toLowerCase();
       
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(compareStrings(s1, s2));
        sc.close();
    }
}
