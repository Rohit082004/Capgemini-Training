// Write a program to find the first non-repeating character in a string and show the result

import java.util.Scanner;

public class Problem1 {
    public static char firstNonRepeatingChar(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }
        return '\0';
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char ans = firstNonRepeatingChar(str);

        if (ans != '\0') {
            System.out.println("First non-repeating character: " + ans);
        } else {
            System.out.println("No non-repeating character found.");
        }
        sc.close();
    }
}
