package Collection_Framework_01_02_2026.Set_Interface;

import java.util.HashSet;

public class UnionAndIntersection {
    public static HashSet<Integer> intersectionOfSets(HashSet<Integer> hs1, HashSet<Integer> hs2){
        HashSet<Integer> ans = new HashSet<>();
        for(int i: hs1){
            if(hs2.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }

    public static HashSet<Integer> unionOfSets(HashSet<Integer> hs1, HashSet<Integer> hs2){
        HashSet<Integer> ans = new HashSet<>();
        ans.addAll(hs1);
        ans.addAll(hs2);

        return ans;
    }
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);

        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(3);
        hs2.add(4);
        hs2.add(5);

        HashSet<Integer> union = unionOfSets(hs1, hs2);
        System.out.println(union);

        HashSet<Integer> intersection = intersectionOfSets(hs1, hs2);
        System.out.println(intersection);
    }
}
