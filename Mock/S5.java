// toggle case

package Mock;

import java.util.Scanner;

public class S5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans= "";
        for(int i=0;i<str.length();i++){

            if(i % 2 == 0){
                char c= Character.toUpperCase(str.charAt(i));
                ans += c;
            }
            else {
                char c= Character.toLowerCase(str.charAt(i));
                ans += c;
            }
        }
        System.out.println(ans);
    }
}
