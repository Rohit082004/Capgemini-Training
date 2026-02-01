package Collection_Framework_01_02_2026.List_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3,1,2,2,3,4));
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        for(int i : list){
            hs.add(i);
        }

        System.out.println(hs);
    }
}
