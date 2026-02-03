package Collection_Framework_01_02_2026.Set_Interface;

import java.util.HashSet;

public class AreSetEqual {

    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        hs1.add(1);
        hs1.add(2);
        hs1.add(3);

        hs2.add(3);
        hs2.add(2);
        hs2.add(1);

        System.out.println(hs1.equals(hs2));
    }
}
