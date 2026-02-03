package Collection_Framework_01_02_2026.Set_Interface;

import java.util.HashSet;

public class CheckSubset {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(2);
        hs1.add(3);

        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(1);
        hs2.add(2);
        hs2.add(3);
        hs2.add(4);

        if(hs1.containsAll(hs2)){
            System.out.println("hs2 is subset of hs1");
        }
        else if(hs2.containsAll(hs1)){
            System.out.println("hs1 is subset of hs2");
        }
        else{
            System.out.println("Not subsets");
        }
    }
}
