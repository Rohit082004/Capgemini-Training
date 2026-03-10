package Questions_10_03_2026;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateFromArray {
    public static int[] util(int[] arr){
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        for(int i: arr){
            hs.add(i);
        }
        int[] ans = new int[hs.size()];
        int id=0;
        for(int i : hs){
            ans[id++] = i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = util(arr);

        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
