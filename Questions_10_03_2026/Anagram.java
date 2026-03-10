package Questions_10_03_2026;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static boolean util(String s1, String s2){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            hm.put(s1.charAt(i) , hm.getOrDefault(s1.charAt(i),0)+1);
        }

        for(int i=0;i<s2.length();i++){
            if(!hm.containsKey(s2.charAt(i))){
                return false;
            }

            else{
                hm.put(s2.charAt(i), hm.get(s2.charAt(i))-1);
                if(hm.get(s2.charAt(i)) == 0) hm.remove(s2.charAt(i));
            }
        }
        return hm.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(util(s1, s2) ? "Yes" : "No");
    }
}
