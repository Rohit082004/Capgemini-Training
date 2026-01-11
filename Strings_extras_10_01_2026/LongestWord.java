
import java.util.Scanner;

public class LongestWord {
    public static String longestWord(String[] arr) {
        String ans = "";

        for (String i : arr) {
            if (i.length() > ans.length()) {
                ans = i;
            }
        }
        return ans;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        System.out.println(longestWord(arr));
        sc.close();
    }
}
