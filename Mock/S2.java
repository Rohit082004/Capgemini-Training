// mirror char

package Mock;

import java.util.Scanner;

public class S2 {
    public static boolean palindrome(String str){
        int l=0, r=str.length()-1;
        while(l <= r){
            if(str.charAt(l) != str.charAt(r)) return false;

            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.length() % 2 != 0){
            System.out.println(str);
            return;
        }
        boolean flag = palindrome(str);
        if(flag == true){
            System.out.println(str.substring(0, str.length()/2));
        }
        else{
            System.out.println(str);
        }
    }
}
