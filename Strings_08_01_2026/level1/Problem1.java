// Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method

import java.util.Scanner;

public class Problem1 {
    public static boolean checkStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        boolean check = str1.equals(str2);
        
        System.out.println(checkStrings(str1, str2) == check);
        sc.close();
    }
}
