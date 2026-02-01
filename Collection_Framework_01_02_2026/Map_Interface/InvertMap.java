package Collection_Framework_01_02_2026.Map_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class InvertMap {
    public static void mapInversion(HashMap<String , Integer> hm, HashMap<Integer, ArrayList<String>> ans){
        for(String s : hm.keySet()){
            int k = hm.get(s);

            if(!ans.containsKey(k)){
                ans.put(k, new ArrayList<>(Arrays.asList(s)));
            }
            else{
                ans.get(k).add(s);
            }
        }
    }
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("A", 1);
        hm.put("B", 2);
        hm.put("C", 1);

        HashMap<Integer, ArrayList<String>> ans = new HashMap<>();

        mapInversion(hm, ans);

        System.out.println(ans);
    }
}
