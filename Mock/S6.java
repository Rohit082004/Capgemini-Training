// longest unique substring

package Mock;

import java.util.HashMap;
import java.util.Scanner;

public class S6 {
    public static int util(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        int n= str.length();
        int i=0,j=0;
        int max=0;
        while(j < n){
            char ch = str.charAt(j);
            hm.put(ch, hm.getOrDefault(ch,0)+1);

            while(hm.get(ch) > 1){
                char left = str.charAt(i);
                hm.put(left, hm.get(left)-1);
                i++;
            }

            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(util(str));
    }
}
