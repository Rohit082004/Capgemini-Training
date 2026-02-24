// rotation palindrome

package Mock;

import java.util.HashMap;
import java.util.Scanner;

public class Q6 {
    public static boolean util(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        int odd=0, even=0;
        for(char c: hm.keySet()){
            if(hm.get(c) % 2 == 0) even++;
            else odd++;
        }

//        if(str.length() % 2 == 0){
//            if(odd > 0 )return false;
//            else return true;
//        }
//        else{
//            if(odd == 1) return true;
//            else return false;
//        }

        return str.length() % 2 == 0 ? odd>0 : odd == 1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(util(str));
    }
}
