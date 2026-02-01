package Collection_Framework_01_02_2026.Map_Interface;

import java.util.HashMap;

public class HighestValueKey {
    public static String highValueKey(HashMap<String, Integer> hm){
        String ans="";
        int max=Integer.MIN_VALUE;

        for(String s: hm.keySet()){
            if(hm.get(s) > max){
                max = hm.get(s);
                ans = s;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("A", 10);
        hm.put("B", 20);
        hm.put("C", 15);

        System.out.println(highValueKey(hm));
    }
}
