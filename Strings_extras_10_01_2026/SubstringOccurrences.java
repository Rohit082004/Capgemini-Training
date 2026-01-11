import java.util.Scanner;

public class SubstringOccurrences {
    public static int occurrencesOfString(String str, String sub) {
        int count = 0;
        int i = 0, j = 0;
        int n = str.length(), k = sub.length();
        while (j < n) {
            if (j - i + 1 < k) {
                j++;
            }
            else {
                if (str.substring(i, j + 1).equals(sub)) {
                    count++;
                }
                i++;
                j++;
            }
        }
        return count;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sub = sc.next();

        System.out.println(occurrencesOfString(str, sub));
        sc.close();
    }
}
