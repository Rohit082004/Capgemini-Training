// Write a program to to check if a text is palindrome and display the result

import java.util.Scanner;

public class Problem5 {
    public static boolean isPalindrome(String str) {
        int s = 0;
        int e = str.length() - 1;
        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean ans = isPalindrome(str);

        if (ans) {
            System.out.println("The given text is a PALINDROME.");
        } else {
            System.out.println("The given text is NOT a palindrome.");
        }
        sc.close();
    }
}
