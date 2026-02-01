package Collection_Framework_01_02_2026.List_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RotateElementsByK {
    public static void reverseList(List<Integer> al, int l, int r){
        while(l <= r){
            int t = al.get(l);
            al.set(l, al.get(r));
            al.set(r, t);

            l++;
            r--;
        }
    }
    public static void rotateByK(List<Integer> al, int n, int k){
        reverseList(al, 0, n-1);
        reverseList(al, 0, n-k-1);
        reverseList(al, n-k, n-1);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            al.add(a);
        }
        rotateByK(al, n, k);
        System.out.println(al);
    }
}
