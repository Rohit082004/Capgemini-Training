import java.util.Scanner;

public class RemoveDuplicates {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (ans.indexOf(str.charAt(i)) == -1) {
                ans += str.charAt(i);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
