package Collection_Framework_01_02_2026.List_Interface;

import java.util.*;

public class FrequencyOfElements {
    public static void elementFreq(List<String> list, LinkedHashMap<String, Integer> hm){
        for(String s : list) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange"));
        int n = list.size();

        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        elementFreq(list, hm);
        System.out.println(hm);
    }
}
