package Questions_10_03_2026;

import java.util.Scanner;

public class PalindromeCount {
    public static boolean palindrome(String s){
        int l = 0, h = s.length()-1;
        while(l < h){
            if(s.charAt(l) != s.charAt(h)) return false;

            l++;
            h--;
        }
        return true;
    }

    public static int util(String str){
        String[] arr = str.split(" ");
        int c=0;
        for (int i=0;i<arr.length;i++){
            if(palindrome(arr[i])) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(util(str));
    }
}
