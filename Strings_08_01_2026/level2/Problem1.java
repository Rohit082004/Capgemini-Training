import java.util.Scanner;

public class Problem1 {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int len1 = findLength(input);

        int len2 = input.length();

        System.out.println("Length using custom method: " + len1);
        System.out.println("Length using built-in length(): " + len2);

        sc.close();
    }
}