
import java.util.Scanner;

// String is pangram or not

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            freq[ch - 'a']++;
        }
        for (int i : freq) {
            if (i == 0) {
                System.out.println("Not pangram");
                return;
            }
        }
        System.out.println("Pangram");
    }
}
