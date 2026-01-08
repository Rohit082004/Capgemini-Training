// Write a program to check if two texts are anagrams and display the result

import java.util.Scanner;

public class Problem4 {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            freq1[ch]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            freq2[ch]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        boolean result = isAnagram(str1, str2);

        if (result) {
            System.out.println("The given texts are ANAGRAMS.");
        } else {
            System.out.println("The given texts are NOT anagrams.");
        }
        sc.close();
    }
}
