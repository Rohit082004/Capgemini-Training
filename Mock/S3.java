// interleaved merge

package Mock;

import java.util.Scanner;

public class S3 {
    public static String util(String s1, String s2){
        String ans="";
        int l1=0, l2=0;
        while(l1 < s1.length() && l2 < s2.length()){
            if(l1 < s1.length()){
                ans += s1.charAt(l1);
                l1++;
            }
            if(l2 < s2.length()){
                ans += s2.charAt(l2);
                l2++;
            }
        }
        while(l1 < s1.length()){
            ans += s1.charAt(l1);
            l1++;
        }
        while(l2 < s2.length()){
            ans += s2.charAt(l2);
            l2++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(util(s1, s2));
    }
}
