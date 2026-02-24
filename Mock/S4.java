// string compression

package Mock;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class S4 {
    public static String util(String str){
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();

        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        String ans="";
        for(char c: hm.keySet()){
            ans += c;
            ans += String.valueOf(hm.get(c));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(util(str));
    }
}
