// reverse words in string

import java.util.Scanner;

public class Problem2 {
    public static void util(String[] arr) {
        for (String s: arr) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            System.out.print(sb.toString() + " ");
        }
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        util(arr);
        sc.close();
    }
}
