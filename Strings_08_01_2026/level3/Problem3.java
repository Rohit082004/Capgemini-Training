// Write a program to find the frequency of characters in a string using the charAt() method and display the result

import java.util.Scanner;

public class Problem3 {
    public static String[][] findCharFrequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] res = new String[uniqueCount][2];
        int id = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] > 0) {
                res[id][0] = String.valueOf(ch);
                res[id][1] = String.valueOf(freq[ch]);
                id++;
                freq[ch] = 0;
            }
        }
        return res;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[][] ans = findCharFrequency(str);
        for (String[] a : ans) {
            System.out.println(a[0] + "\t\t" + a[1]);
        }
        sc.close();
    }
}
