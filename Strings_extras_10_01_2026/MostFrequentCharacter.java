import java.util.Scanner;

public class MostFrequentCharacter {
    public static char frequentChar(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        char ans = ' ';
        int l = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > l) {
                l = freq[i];
                ans = (char) (i + 'a');
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.err.println(frequentChar(str));
    }
}
