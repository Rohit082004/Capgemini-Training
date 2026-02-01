package Collection_Framework_01_02_2026.List_Interface;

import java.util.*;

public class ReverseList {
    public static void reverseAL(List<Integer> al){
        int l =0, r= al.size()-1;

        while(l <= r){
            int t = al.get(l);
            al.set(l, al.get(r));
            al.set(r, t);

            l++;
            r--;
        }
    }

    public static List<Integer> reverseLL(List<Integer> ll){
        List<Integer> ans = new LinkedList<>();
        for(Integer i : ll){
            ans.addFirst(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverseAL(al);
        System.out.println(al);

        List<Integer> ll = new LinkedList<>(Arrays.asList(6,7,8,9,10));
        List<Integer> ans = reverseLL(ll);
        System.out.println(ans);
    }
}
