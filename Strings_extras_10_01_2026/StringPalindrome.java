import java.util.Scanner;

public class StringPalindrome {
    public static String reverse(char[] arr, int s, int e) {
        while (s <= e) {
            char t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }

        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        return ans;
    }
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        String rev = reverse(arr, 0, str.length()-1);

        if(str.equals(rev)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

        sc.close();
    }
}
