import java.util.Scanner;

public class CompareStrings {
    public static int stringComparison(String str1, String str2) {
        int min = Math.min(str1.length(), str2.length());

        for (int i = 0; i < min; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                return -1;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int ans = stringComparison(str1, str2);

        if (ans == -1)
            System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
        else if(ans == 1)
            System.out.println(str1 + " comes after " + str2 + " in lexicographical order");
        else
            System.out.println("Both are equal");
    }
}
