package Collection_Framework_01_02_2026.Map_Interface;

import java.util.HashMap;
import java.util.Scanner;

public class MergeTwoMaps {
    public static void merge(HashMap<Character, Integer> hm1, HashMap<Character, Integer> hm2){
        for(char ch: hm2.keySet()){
            if(hm1.containsKey(ch)){
                hm1.put(ch, hm1.get(ch) + hm2.get(ch));
            }
            else{
                hm1.put(ch, hm2.get(ch));
            }
        }
    }
    public static void main(String[] args) {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        hm1.put('A', 1);
        hm1.put('B', 2);

        hm2.put('B', 3);
        hm2.put('C', 4);

        merge(hm1, hm2);

        for(char ch: hm1.keySet()){
            System.out.println(ch + " " + hm1.get(ch));
        }
    }
}
