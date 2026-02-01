package Collection_Framework_01_02_2026.Map_Interface;

import java.util.HashMap;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static HashMap<String, Integer> countWords(String str){
        HashMap<String , Integer> hm = new HashMap<>();

        str = str.toLowerCase();
        StringBuilder word = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                word.append(ch);
            }
            else{
                if(word.length() > 0){
                    String w = word.toString();
                    hm.put(w, hm.getOrDefault(w, 0) + 1);
                    word.setLength(0);
                }
            }
        }

        if(word.length() > 0){
            String w = word.toString();
            hm.put(w, hm.getOrDefault(w, 0) + 1);
        }

        return hm;
    }
    public static void main(String[] args) {
        String str = "Hello world, hello Java!";

        HashMap<String , Integer> ans =countWords(str);

        System.out.println(ans);
    }
}
