package Questions_10_03_2026;

import java.util.HashMap;
import java.util.Scanner;

public class MaxOccuringChar {
    public static char util(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<str.length();i++){
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0)+1);
        }
        int max=0;
        char ch = ' ';
        for(char i : hm.keySet()){
            if(hm.get(i) > max){
                max = hm.get(i);
                ch = i;
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(util(str));
    }
}
