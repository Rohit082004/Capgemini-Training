// freq of characters in string

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < freq.length;i++) {
            if (freq[i] != 0) {
                System.out.print((char)(i + 'a') + ":" + freq[i] + " ");
            }
        }
    }
}
